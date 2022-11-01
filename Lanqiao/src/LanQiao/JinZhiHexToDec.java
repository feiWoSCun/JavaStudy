package LanQiao;
import java.util.Scanner;
public class JinZhiHexToDec { static long f = 0;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        binToDec(hex(str));}



    //方法
    static String hex(String str) {
        return Integer.toHexString(Integer.valueOf(str, 16));}
    static void binToDec(String c) {
        for (int k = 0; k < c.length(); k++) {
            String string = c.substring(k, k + 1);
            int a=0;
            switch (string) {
                case ("a"):
                    a = 10;
                    break;
                case ("b"):
                    a = 11;
                    break;
                case ("c"):
                    a = 12;
                    break;
                case ("d"):
                    a = 13;
                    break;
                case ("e"):
                    a = 14;
                    break;
                case ("f"):
                    a = 15;
                    break;
                case ("1"):
                    a = 1;break;
                case ("2"):
                    a = 2;break;
                case ("3"):
                    a = 3;break;
                case ("4"):
                    a = 4;break;
                case ("5"):
                    a = 5;break;
                case ("6"):
                    a = 6;break;
                case ("7"):
                    a = 7;break;
                case ("8"):
                    a = 8;break;
                case ("9"):
                    a = 9;break;
                case("0"):a=0;break;
            }
        long  d = (long) Math.pow(16, c.length()-k-1);
          long e = a * d;
           f+=e;}
            System.out.println(f);
    }
}



