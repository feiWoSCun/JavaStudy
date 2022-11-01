package Suo;
public class Cat {
    int no;
    public Cat(int no) {
        this.no = no;
    }

   public synchronized  void doSome(){
       System.out.println("dosome开始");
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("dosome结束");
   }
    public  synchronized  void doOther(){
        System.out.println("doother开始");
        System.out.println("doother结束");
    }
}
