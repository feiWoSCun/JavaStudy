package Coleection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1,"luobin");;
        map.put(2,"luobi");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator it=entries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
