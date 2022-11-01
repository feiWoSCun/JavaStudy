package com.example.demo;

public class test {
    public static void main(String[] args) {
        double d = 1335535215;
        //计数次方
        int i = 0;
        while (true) {
            i++;
            //判断是否继续取模
            double k = d /= 10;
            if (k < 10.0) break;
        }
        //截取字符串
        String substring = String.valueOf(d).substring(0, 5);
        String s = substring + "e" + i;
        System.out.println(s);
    }
}
