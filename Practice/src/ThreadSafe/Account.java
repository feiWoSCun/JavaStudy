package ThreadSafe;

public class Account {
    public Account(int account, String number) {
        this.account = account;
        this.number = number;
    }

    private int account;
    private String number;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void withDraw() {
        synchronized ("我是你大爷") {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int before = getAccount();
            int a = 5000;
            int b = before - a;
            setAccount(b);
        }
    }
}
