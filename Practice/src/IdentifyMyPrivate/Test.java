package IdentifyMyPrivate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Test extends Identify{
    public static void main(String[] args) throws IOException {
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath());
      Reader read=new FileReader(Thread.currentThread().getContextClassLoader().getResource("jdbc.properties").getPath());
        Properties pro=new Properties();
        pro.load(read);
    read.close();
        System.out.println(pro.get("user"));
    }
}
