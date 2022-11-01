package LanQiao;

import java.util.Locale;
// import java.util.Scanner;
// public class LanQiao.LanQiao {
    /* static Scanner sca =new Scanner(System.in);
    public static void main(String[] args) {
        int n=sca.nextInt();
        int[] arr=new int[n];
        for(int b = 0;b<arr.length;b++){
            arr[b]= sca.nextInt();
        }
        for(int d=0;d<arr.length-1;d++){
        for(int a=0;a<arr.length-d-1;a++) {
            if (arr[a] > arr[a + 1]) {
                int c = arr[a];
                arr[a] = arr[a + 1];
                arr[a + 1] = c;
            }
        }
        }
        for(int e=0;e<arr.length;e++){
            System.out.print(arr[e]);
            System.out.print(" ");
        }
    }
 }*/
 import java.util.Scanner;
 public class LanQiao{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);//
         int a = sc.nextInt();
         for (int b = 0; b < a; b++) {
             String line = sc.next();//让用户输入字符串
             StringBuilder builder = new StringBuilder();
             for (int k = 0; k < line.length(); k++) {
                 //将16进制转换成2进制；
                 builder.append(hexToBin(line.substring(k, k + 1)));
             }
             String bin = format(builder.toString());//拿到二进制串；
             builder = new StringBuilder();
             for (int k = 0; k < bin.length(); k += 3) {
                 builder.append(binToOct(bin.substring(k, k + 3)));}
             String result = builder.toString();
             for (int k = 0; k < result.length(); k++) {
                 if (result.charAt(k) != '0') {
                     result = result.substring(k);
                     break;}}
             System.out.println(result);}}
     static String hexToBin(String hex){
     return format1(Integer.toBinaryString(Integer.valueOf(hex,16)));}
     static String binToOct(String bin){
         return Integer.toOctalString(Integer.valueOf(bin,2));}
     static  String format(String str){
         if((str.length())%3==1) {
             str = "00" + str;}
             if((str.length())%3==2){
                 str="0"+str;}
         return str;}
     static  String format1(String str) {
         if ((str.length()) % 4 == 1) {
             str = "000" + str;}
         if ((str.length()) % 4 == 2) {
             str = "00" + str;}
         if ((str.length()) % 4 == 3) {
             str = "0" + str;}
         return str;}}

