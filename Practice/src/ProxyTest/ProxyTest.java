package ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        SellAnimal animal=new Cat();
      /*  ProxyCat proxyCat=new ProxyCat(animal);*/
        InvocationHandler invocationHandler=new ProxyCat(animal);
        SellAnimal o = (SellAnimal) Proxy.newProxyInstance(animal.getClass().getClassLoader(),
                        animal.getClass().getInterfaces(), invocationHandler);

        int sell = o.sell(1);
        System.out.println(sell);

     /*   o.toString();*/
    }
}
