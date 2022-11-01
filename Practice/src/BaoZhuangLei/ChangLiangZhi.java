package BaoZhuangLei;

import java.text.SimpleDateFormat;

public class ChangLiangZhi {
    public static void main(String[] args) {
/*
        Integer a = 90;
        Integer b = 90;
        Integer c = new Integer(90);
        System.out.println(a == b);
        System.out.println(b==c);*/
        SimpleDateFormat sdf=new SimpleDateFormat("SSSS");
        for (int i = 0; i < 10; i++) {
            Integer integer = Integer.valueOf(sdf.format(System.currentTimeMillis()));
            System.out.println(integer);
        }



    }
}
