package CustomerAndProducer;

import java.util.List;

public class Producer implements Runnable{
    List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {

                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj=new Object();
            list.add(obj);
                System.out.println(Thread.currentThread().getName()+"已生产");
            list.notify();
            }
        }
    }
    }

