package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InvokeConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("Reflect.Animal");
        Constructor<?> constructor = aClass.getConstructor( int.class,String.class);
        Object 罗彬 = constructor.newInstance(18, "罗彬");
        System.out.println(罗彬);
    }
}
