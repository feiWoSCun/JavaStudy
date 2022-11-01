package juctest;


import java.util.concurrent.locks.LockSupport;

public class JucTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()-> LockSupport.park());
    }
}
