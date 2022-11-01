package JieKou;

public class AmericaCooker implements FoodMenu {
    @Override
    public void yuXiAngRouSi() {
        System.out.println("美国厨师做的西红柿炒鸡蛋");
    }

    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("美国厨师做的鱼香肉丝");
    }
}
