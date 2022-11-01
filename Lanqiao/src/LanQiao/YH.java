package LanQiao;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
//这是一个错误的杨辉三角题，错误原因，用阶乘处理的话，会很容易超出范围
public class YH{
    static  int ciShu=1;
    static  long a=1;
    static  long  m=1,c=1,e=1,f=1,g=1;
    static  int k=0;
    public static void main(String[] args) {
      /*  Scanner sca=new Scanner(System.in);
       int abc=sca.nextInt();*/
        long[] yangHui = new long[10000];
        yangHui[0] = 1;
        for(int n=1;n<=40;n++) {
            for (a = 1; a <= n; a++) {
                e *= a;//算出n的阶乘
            }
            k = 0;
            yangHui[ciShu] = 1;
            ciShu += 1;
            k++;
            for (int d = k; k < n; k++) {
                for (m = 1; m <= k; m++) {
                    f *= m;//算出k的阶乘
                }
                for (c = 1; c <=(n - k); c++) {
                    g *= c;//算出（n-k）的阶乘
                }
                yangHui[ciShu] = e / (f * g);
                ciShu += 1;
                f = 1;
                g = 1;
            }
            if (k == n) {
                yangHui[ciShu] = 1;
            }
            ciShu += 1;
e=1;

        }
       for(int real=0;real<yangHui.length;real++){
            System.out.print(yangHui[real]+" ");
        }
/*  for(int real=0;real<yangHui.length;real++){
            if(yangHui[real]==abc) {
                System.out.println(real + 1);
                break;
            }
        }*/
    }
}
