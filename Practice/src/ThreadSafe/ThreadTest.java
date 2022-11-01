package ThreadSafe;

public class ThreadTest extends Thread  {
    private Account account;

    public ThreadTest(Account account) {
        this.account = account;
    }

    public void run() {
        account.withDraw();
        System.out.println("取走" + 5000 + "剩余" + account.getAccount());
    }
}

