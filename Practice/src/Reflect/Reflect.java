package Reflect;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class Reflect {
    public static void main(String[] args) throws IOException {
        //获取文件的绝对路径;
        String path=Thread.currentThread().getContextClassLoader()
                .getResource("Reflect.java").getPath();
        System.out.println(path);
        Reader reader=new FileReader(path);
        //以流的形式返回文件：
        InputStream in=Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("jdbc.properties");
        Properties properties=new Properties();
        properties.load(in);

        reader.close();
        System.out.println(properties.get("user"));
        List<String> list=new LinkedList<>();
        list.add("wlefm");
    }
}
