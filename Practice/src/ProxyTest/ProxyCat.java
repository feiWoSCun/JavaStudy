package ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyCat implements InvocationHandler {

  /*  动态代理主要是以下几个步骤：
1：创建一个类实现InvocationHandler接口，然后重写invoke方法，注意这个方法不是Method里面的方法
    invoke(Object proxy, Method method, Object[] args)
        proxy：这个参数不用管，系统自己创建的
    method：这个参数也是系统自己创建的，我们需要利用反射机制，调用某个对象的方法
    method的invoke需要传入一个对象，我们可以创建一个成员变量（最好是接口，转型），通过构造方法为其赋值并传入invoke方法中，
    */
    public SellAnimal animal;
    /*args：是一个Object数组，是传进来的参数
    调用了invoke方法之后，我们就可以在这之上实现想要的增强功能
    2：调用proxy的静态方法.newProxyInstance，里面需要传入被代理的类的类加载器和实现的接口，以及上述1的InvocationHandler的实例；
    3：此时的proxy就为我们创建好了实例，这时再调用方法就可以实现增强了
    好处：
    动态代理不需要改变源码，也不用像静态代理一样（类多了，增强类就很多）。
    动态代理可以代理接口下所有的类
   */
    public ProxyCat() {
    }
    public ProxyCat(SellAnimal animal) {
        this.animal = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        obj = method.invoke(animal, args);
if(obj!=null){
    System.out.println("小猫咪的价格是45元");
    return 45;
}
        return null;
    }
}
