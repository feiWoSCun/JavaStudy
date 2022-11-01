package LanQiao;

import java.util.Scanner;

public class YangHui {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        long s=sca.nextLong();
      int i = 3000;
        long[][] yangHui = new long[i][];
        int j = 0;
        yangHui[0] = new long[3];
        yangHui[0][0] = 0;
        yangHui[0][1] = 1;
        yangHui[0][2] = 0;
        for (int a = 1; a <= i - 2; a++) //用a+1// 表示排数
        {
            yangHui[a] = new long[a + 3];//开辟了二维数组的每个一维数组元素个数。
            yangHui[a][0] = 0;
            yangHui[a][a + 2] = 0;
           //给第一排赋值
                int c = 0;
                for (int n = 1; n < ((a + 2)); n++) {
                    yangHui[a][n] = yangHui[a - 1][c] + yangHui[a - 1][c += 1];
                }
        }
/*       for (int e = 0; e <i-1; e++) {
            for (int f = 0; f < yangHui[e].length; f++) {
                System.out.print(yangHui[e][f]+" ");
            }
            System.out.println("\n");}
        System.out.println("\n");*/
           for (int e = 0; e <i-1; e++) {
                for (int f = 0; f < yangHui[e].length; f++) {
                    if (s == yangHui[e][f]) {
                      long x=(e+1) *((long)(e)/ 2) +f;
                        System.out.print(x);
                        e=i-1;
                        break;
                    }
                }
            }
           // System.out.println("\n");

    }
}