package CanShuChuanDi;
//Java中只有值传递
public class Test {
    String name;

    public Test(String name) {
        this.name = name;
    }

    public void swap(Test t) {
        t=new Test("123");
    }

    public static void main(String[] args) {
        Test t1 = new Test("罗彬");
        Test t2 = new Test("hongdutyang");
        t1.swap(t1);
        System.out.println(t1.name);
    }
}
