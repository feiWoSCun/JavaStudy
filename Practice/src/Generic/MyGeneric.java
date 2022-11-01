package Generic;

public class MyGeneric < T extends Test >{
    public void setT(T t) {
        this.t = t;
    }

    private T t;

    public T getT() {
        return t;
    }

    public MyGeneric(T t){
        this.t=t;
    }

}

