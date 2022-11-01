package LanQiao;

import java.text.DecimalFormat;
import java.util.Scanner;
import  java.math.BigDecimal;
public class Test {
    static double b = 1;
    static double f = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double n = sca.nextDouble();
        double m = sca.nextDouble();
        double cha = n - m;
        if (cha == 0) {

            System.out.println("1.0000");
        }
        if(cha<0){
            for (int a = 0; a < m; a++) {
                b *= 1 / n;
            }
            for (double d = m; m >= n + 1; m--) {
                f += m * (m - 1);
            }
            double g = b * f;



            DecimalFormat df1 = new DecimalFormat("0.0000");
            System.out.println(df1.format(g));

        }
else{
    System.out.println("0.0000");
}
    }
}
