package com.itextpdf;

import com.itextpdf.annotation.ColumnName;
import com.itextpdf.document.CatToTiger;
import com.itextpdf.entity.Rsvo;
import com.itextpdf.entity.UserData;
import com.itextpdf.mapper.SelectZdMapper;
import com.itextpdf.service.impl.selectZdMapperServiceImpl;
import com.itextpdf.utils.ReflectUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.*;

@SpringBootTest
class ITextPdfApplicationTests {
    @Autowired
    SelectZdMapper mapper;
    @Autowired
    selectZdMapperServiceImpl impl;
    @Test
    public void test01() throws Exception {
        List<Rsvo> 用户数据 = mapper.selectAll("用户数据");
            List<UserData> trans = ReflectUtils.trans(用户数据, UserData.class);
        System.out.println("");
    }
    @Test
    public void test02(){
        Class<Rsvo> rsvoClass = Rsvo.class;
        Field[] fields = rsvoClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
    @Test
    public void test03(){
        List<Map<String, String>> maps = mapper.selectBdName();
        System.out.println("");
    }
    @Test
    public void test04() throws Exception {
        //把表单名字传入就行了
        String[] sheetNames = impl.getSheetNames();
        List[] lists = impl.transListIntoEntity(sheetNames);
        CatToTiger.creatPdf(lists);
        System.out.println();
        }
    @Test
    public void test05() {
        Field[] fields = UserData.class.getDeclaredFields();
        List<String> li = new ArrayList<>();
        Arrays.stream(fields).map(field -> field.getAnnotation(ColumnName.class))
                .forEach(excel -> li.add(excel.value()));
        String str[] = (String[]) li.toArray();
        System.out.println();
    }
    @Test
    public void test07() {
        List<String> 用户数据 = mapper.selectTest("用户数据");
        System.out.println();
    }
   /*  @Test
   void contextLoads() {
        Map<Integer, String> stateMap = new HashMap<>();
        List<Map<String, String>> mapList = mapper.selectAll("用户数据");
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        for (Map<String, String> map : mapList) {
            String key = null;
            String value = null;
            for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                String key1 = stringStringEntry.getKey();
                if(key1.equals("nr"))
                   key=stringStringEntry.getValue();
                String value1 = stringStringEntry.getValue();
                if(key1.equals("zdyw"))
                    value = stringStringEntry.getValue();
            }
            objectObjectHashMap.put(key, value);
        }
        System.out.println(":");
    }
*/
   @Test
   public void test06() {
       System.out.println(String.class.getName());
   }
}

