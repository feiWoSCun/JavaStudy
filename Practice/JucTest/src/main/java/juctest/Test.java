package juctest;

public class Test {
    public static void main(String[] args) {
        Obj obj = new Obj();
        System.out.println(obj);
        test(obj);
        System.out.println(obj);
    }
    static  void test(Obj obj){
        System.out.println(obj);
        obj=new Obj();
        System.out.println(obj);
    }
}
