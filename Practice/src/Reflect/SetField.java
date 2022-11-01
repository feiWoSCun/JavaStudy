package Reflect;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class SetField {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
      /*  String load = Thread.currentThread().getContextClassLoader()
                .getResource("Reflect").getPath() + "/Animal";*/
         Class animalClass=Class.forName("Reflect.Animal");
        Object obj= animalClass.newInstance();
        Field age = animalClass.getDeclaredField("age");
age.set(obj,1999);
/*Animal an=(Animal) obj;*/
        System.out.println(age.get(obj));
        //打破封装
         Field myName=animalClass.getDeclaredField("name");
          myName.setAccessible(true);
         myName.set(obj,"罗彬");
        System.out.println(myName.get(obj));
    }
}
