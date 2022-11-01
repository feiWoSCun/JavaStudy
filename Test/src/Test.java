public class Test {
    int a;

    public Test() {
    }

    public Test(int a) {
        this.a = a;
    }

    public void doOther() {
        System.out.println("do other");

    }

    public void doSome() {
        this.doOther();
        doOther();
    }

    void tt() {
        Test test = new Test();
        test.doOther();
        this.doOther();
    }
}