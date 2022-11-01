package ProxyTest;

public class Cat implements SellAnimal {
    @Override
    public int sell(int a) {
        System.out.println("小猫咪的价格是40元一只?");
        return  40;
    }

     /*   public String toString() {
        return "一只猫40元";
    }*/
}
