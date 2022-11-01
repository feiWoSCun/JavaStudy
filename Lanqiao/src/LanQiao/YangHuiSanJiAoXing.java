package LanQiao;

import jdk.dynalink.beans.StaticClass;

public class YangHuiSanJiAoXing {
   static  int ciShu=1;
   static  int a=1;
   static  int m=1,c=1;
   static  int k=0;
   public static void main(String[] args) {
      int[] yangHui = new int[1000000000];
      yangHui[0] = 1;
      for(int n=1;n<=1e+4;n++){
for( a=1;a<=n;a++) {
a*=a;//算出n的阶乘
}
 k=0;
   yangHui[ciShu]=1;
   ciShu+=1;
   k++;
for(int d=k;k<=n;k++) {
   for (m = 1; m <= k; m++) {
      m *= m;//算出k的阶乘
       m-=1;
   }
   for (c = 1; c <= (n - k); c++) {
      c *= c;
      c-=1;//算出（n-k）的阶乘
   }
   ciShu += 1;
   yangHui[ciShu] = a / (m * c);
}
ciShu+=1;
      }
      for(int ans=0;ans<20;ans++){
         System.out.print(yangHui[ans]+" ");
      }
   }
}
