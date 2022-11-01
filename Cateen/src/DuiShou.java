public class DuiShou {
    Hero hero1 = new Hero(299, 22, 23);

    void see() {
        ChooseHero chooseHero = new ChooseHero();
        System.out.println("你的对手" + chooseHero.hero[2-chooseHero.a] + ":");
        System.out.println("生命值是：" + hero1.getLife() + "攻击力是" + hero1.getAttract() + "防御力是：" + hero1.getDefence());
    }
    public int getLife() {
        return hero1.getLife();
    }

    public int getAttract() {
        return hero1.getAttract();
    }

    public int getDefence() {
        return hero1.getDefence();
    }
}