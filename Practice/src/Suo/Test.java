package Suo;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat(123);
        Cat cat2=new Cat(124);
     /*   Cat cat2=new Cat(124)*/;
        MyThread t1=new MyThread(cat);
        t1.setName("t1");
     MyThread t2=new MyThread(cat2);
        t2.setName("t2");
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
