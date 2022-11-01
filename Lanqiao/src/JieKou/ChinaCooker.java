package JieKou;

public class ChinaCooker implements FoodMenu{
    @Override
    public void xiHongShiChaoJiDan() {
        System.out.println("中国厨师做的西红柿炒鸡蛋");
    }

    @Override
    public void yuXiAngRouSi() {
        System.out.println("中国厨师做的鱼香肉丝");
    }
}
