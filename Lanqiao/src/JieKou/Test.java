package JieKou;

public class Test {
    public static void main(String[] args) {
        FoodMenu fm=new AmericaCooker();
        Customer cus=new Customer(fm);
            fm.xiHongShiChaoJiDan();
    }

}
