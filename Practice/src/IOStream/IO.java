package IOStream;

import java.io.*;

public class IO {
    public static void main(String[] args) {
        byte[] bs=new byte[10*1024];
    FileInputStream fis=null;
    FileOutputStream fos=null;
        try {
            fis= new FileInputStream("D:\\犬夜叉壁纸\\ca604b492df893da92ca78514fb56fcf.jpeg");
            fos=new FileOutputStream("C:\\拷贝\\ca604b492df893da92ca78514fb56fcf.jpeg",true);
            while (fis.read(bs)!=-1) {
                fos.write(bs);
            }
fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        }
        }

