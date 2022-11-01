package JieKou;

public class Customer {
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    public Customer(){}
    public Customer(FoodMenu foodMenu){
        this.foodMenu=foodMenu;
    }
public void order(){
       this.getFoodMenu().yuXiAngRouSi();
       this.getFoodMenu().xiHongShiChaoJiDan();
}
    private FoodMenu foodMenu;

}
