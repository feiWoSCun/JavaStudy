package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Systems {
    public static PrintStream out;

    public static void main(String[] args) throws FileNotFoundException {
        java.lang.System.setOut(new PrintStream(new FileOutputStream(new File("D:"+File.separator+"user.txt"))));
        java.lang.System.out.println("我宣布个事，我是个傻逼！");
    }
}
