package CustomerAndProducer;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list =new ArrayList();
        Thread t1=new Thread(new Producer(list));
        Thread t2 =new Thread(new Customer(list));
        t1.setName("生产者模式");
        t2.setName("消费者模式");
        t1.start();
        t2.start();
        
    }
}
