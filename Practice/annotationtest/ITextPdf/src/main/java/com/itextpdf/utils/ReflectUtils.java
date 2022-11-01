package com.itextpdf.utils;

import com.itextpdf.annotation.ColumnName;
import com.itextpdf.entity.Rsvo;

import java.lang.reflect.Field;
import java.util.*;

public class ReflectUtils {
    /**
     * 传入一个java类，得到他的所有注解
     * @param c
     * @return
     * @param <T>
     */
  public static <T> String[] getAnnotations(Class<T> c){
       Field[] fields = c.getDeclaredFields();
       List<String> li=new ArrayList<>();
    Arrays.stream(fields).map(field -> field.getAnnotation(ColumnName.class))
               .forEach(excel->li.add(excel.value()));
    String str[] =new String[li.size()];
       for (int i = 0; i < li.size(); i++) {
           str[i]=li.get(i);
       }
       return str;
   }

    /**
     * 通过反射拿到多个实体类的集合
     * @param list
     * @param c
     * @return
     * @param <E>
     * @throws Exception
     */
    public static <E> List<E> trans(List<Rsvo> list, Class<E> c) throws Exception {
        List<E> eList = new ArrayList<>();
        Field[] declaredFields = c.getDeclaredFields();
        while (list.size() > 0) {
            //创建实体类
            E e = c.getConstructor(null).newInstance();
            Set<String> set = new HashSet<>();
            for (Field field : declaredFields) {
             /*   if (set.contains(field)) break;
                else {
                    set.add(field);
                    field.setAccessible(true);
                }*/
         /*       for (Rsvo rsvo : list) {
                    if (field.getName().equals(rsvo.getZdyw())) {
                        field.set(e, rsvo.getNr());
                        list.remove(rsvo);
                        continue;
                    }
                }*/
                field.setAccessible(true);
                for (int i = 0; i < list.size(); i++) {
                    Rsvo rsvo = list.get(i);
                    if (set.contains(rsvo.getZdyw())) break;
                    else {
                        if (field.getName().equals(rsvo.getZdyw())) {
                            set.add(rsvo.getZdyw());
                            field.set(e, rsvo.getNr());
                            list.remove(list.get(i));
                        }

                    }
                }
                set.clear();
            }
            eList.add(e);
        }
        return eList;
    }
}
