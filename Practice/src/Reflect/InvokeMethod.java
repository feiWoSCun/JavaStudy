package Reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.security.PublicKey;

public class InvokeMethod {
    public static void main(String[] args)throws Exception {
        Class<?> aClass = Class.forName("Reflect.Animal");
        System.out.println(Modifier.toString(aClass.getModifiers()));


   /*     Object o = aClass.newInstance();
        Method eat = aClass.getDeclaredMethod("eat", String.class, int.class);
        *//*invoke:调用*//*
eat.invoke(o,"猫",2);*/

    }
}
