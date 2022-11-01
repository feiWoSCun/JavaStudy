package ThreadSafe;

public class Test {
    public static void main(String[] args) {
        Account ac = new Account(10000,"我是你大爷");
        ThreadTest t1 = new ThreadTest(ac);
        ThreadTest t2 = new ThreadTest(ac);
        t1.start();
        t2.start();
    }
}