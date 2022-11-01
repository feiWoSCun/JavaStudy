package LanQiao;
import java.util.Scanner;
public class HuiWenShu {
    static int b = 0;
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        for (int i = 10000; i <= 999999; i++) {
            String huiWen = String.valueOf(i);//i转化为字符串
            for (int e = 0; e < huiWen.length(); e++)
            {
                if (Integer.valueOf(huiWen.substring(e, e + 1),10)==Integer.valueOf(huiWen.substring
                        (huiWen.length() - e - 1, huiWen.length() - e),10)) {
                    //判断是否为回文(e+1)+m=length+1,12345
                    b += Integer.valueOf(huiWen.substring(e, e + 1), 10);
                }
                else{
                    b=0;
                    break;
                }
                }
         if (b == n) {
                System.out.println(i);
            }
            b = 0;
        }
    }
}
//bool什么时候输出01，true false