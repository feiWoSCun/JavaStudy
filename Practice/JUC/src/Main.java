import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        System.out.println(";aerihg;;");
        FutureTask<Integer> futureTask=new FutureTask<>(()->{
            System.out.println("futuretask执行了");
            Thread.sleep(1000);
            return 100;
        });
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        Thread t2=new Thread(futureTask,"future线程");
        t2.start();

        try {
            Integer integer = futureTask.get();
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");


    }
}