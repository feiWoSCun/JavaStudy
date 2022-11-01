package Reflect;

  public class Animal {
    public int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("执行！");
    }

    void eat(String str, int a) {
        if(str=="猫"&&a==2)
        System.out.println("小猫正在吃东西");
    }

}
