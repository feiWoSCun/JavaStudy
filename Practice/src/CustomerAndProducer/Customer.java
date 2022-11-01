package CustomerAndProducer;

import java.util.List;

public class Customer implements Runnable {
    List list;

    public Customer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    list.remove(0);
                    System.out.println(Thread.currentThread().getName()+"已消费");
                    list.notify();
                }
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
