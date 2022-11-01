package Coleection;

import java.util.*;
import java.util.LinkedList;

public class ArryList {
       public static void main(String[] args) {
           LinkedList< Object> c = new LinkedList<>();
            c.add(true);
            c.add("osihv");
            c.add(1234);
           Object[] str= c.toArray(new Object[5]);
            Iterator it= c.iterator();//iteratoro方法可以返回一个Iterrator的对象
       while(it.hasNext())//判断下一个是否为true
       {
           System.out.println(it.next());
       }
        }

}
