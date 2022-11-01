package IOStream;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Copy {
    public static void main(String[] args) throws Exception {
File file=new File("D:\\AS");
File copyFile=new File("C:\\myCopy");
copy(file,copyFile);
    }
public static void copy(File file,File copyFile)throws Exception{
        //如果是文件，则进行拷贝之后，返回
        if(file.isFile()){
            //准备输入和输出流，bytes数组进行拷贝
            FileInputStream is=new FileInputStream(file.getAbsoluteFile());
            String string=copyFile.getAbsolutePath()+file.getAbsolutePath().substring(2);
            FileOutputStream os=new FileOutputStream(string);
            byte bytes[]=new byte[1024*1024];
            //拷贝
            int readCount=0;
            while((readCount=is.read(bytes))!=-1){
                os.write(bytes,0,readCount);
            }
            //关闭，刷新流
            os.flush();
            if(is!=null);
            is.close();
            if(os!=null);
            os.close();
         return;
        }
        //如果不为空
        if(file!=null) {
            //如果是目录
            if (file.isDirectory()) {
                //准备文件数组不断递归拷贝文件
                File f[] = file.listFiles();
                if(f==null){
                    return;
                }
                for (int a = 0; a < f.length; a++) {
                    //拷贝路径
                    String str=f[a].getAbsolutePath();
                    String string=copyFile.getAbsolutePath()+file.getAbsolutePath().substring(2);
                    File help=new File(string);
                    //如果目录不存在，则创建目录
                    if(!help.exists()){
                        help.mkdirs();
                    }
                    copy(f[a],copyFile);
                }
            }
        }

    }
}
