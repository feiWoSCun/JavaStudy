package CustomerAndProducer;

public class Deadlock extends Thread{
    Object obj;
    Object obj2;
    public Deadlock(Object obj,Object obj2){
        this.obj=obj;
        this.obj2=obj2;
    }

    @Override
    public void run() {

    }
}
