package LanQiao;

import java.util.Scanner;
public class XinYunShu {
    static int b = 0;
static int e=0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int[] a = new int[(n + 4) / 2];
        int[] d = new int[(n + 4) / 2];
        for (int b = 0; b < n / 2; b++) {
            a[b] = 2 * b + 1;
        }
   /*   for (int h= 0; h < a.length; h++) {
            System.out.print(a[h] + " ");
        }*/
        for (int f = 1; f < n/5; f++) {
            for (int e = 0; e < a.length - 1; e++) {
                if ((e + 1) % a[f] == 0) {
                    a[e] = a[e + 1];
                }
            }
       /*     for (int h= 0; h < a.length; h++) {
                System.out.print(a[h] + " ");
            }*/
            for (e = 0; e < a.length - 2; e++) {
                if (a[e] != a[e + 1]) {
                    d[b] = a[e];
                    b += 1;
                }
            }

  /*  System.out.println(b);
             for (int r = 0; r < d.length; r++) {
                System.out.print(d[r] + " ");}
            System.out.println("\n");*/
            for (int g = 0; g < a.length; g++) {
                if (g < b)
                {a[g] = d[g];}
                else {
                    a[g] = 0;
                }

            }
            b=0;
       /*     for (int r = 0; r < a.length; r++) {
                System.out.print(a[r] + " ");}
            System.out.println("\n");*/

            }
        int k=0;
        for(int c=0;c<a.length;c++){
            if(a[c]>m){
                k++;
            }else if(a[c]>n) {
                break;
            }
            }

        System.out.println(k);
        }
        }
