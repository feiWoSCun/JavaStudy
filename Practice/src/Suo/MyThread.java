package Suo;

public class MyThread extends Thread{
    public Cat cat;
    public MyThread(Cat cat){
        this.cat=cat;
    }
    @Override
    public void run() {
if ( Thread.currentThread().getName().equals("t1"))
    cat.doSome();
    if ( Thread.currentThread().getName().equals("t2"))
            cat.doOther();
/*        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
