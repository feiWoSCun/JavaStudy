public class ThreadTest implements Runnable{
    boolean run=true;
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (run) {
                System.out.println("分支线程" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
    public static void main(String[] args) {
        /*ThreadTest th=new ThreadTest();
        Thread thread=new Thread(th);
        thread.start();*/
        ThreadTest tr=new ThreadTest();
        Thread thread=new Thread(tr);
        thread.setPriority(10);
        thread.start();
        for(int i=0;i<=10;i++){
            System.out.println("主线程"+i);
        }

    }
}


