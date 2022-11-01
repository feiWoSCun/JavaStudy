class Hero {
    private String name;
    private int life;
    private int attract;

    public String getName() {
        return name;
    }

    public int getLife() {
        return this.life;
    }

    public int getAttract() {
        return attract;
    }

    public int getDefence() {
        return defence;
    }

    private int defence;
public Hero(){}
    public Hero(int life, int attract, int defence) {
    this.life=life;
    this.attract=attract;
    this.defence=defence;
    }

    public void setName(String name) {

        this.name = name;
    }

    public  void   setLife(int life) {
    while(life < 0 || life > 500) {
            System.out.println("信息有误！");
            return;
        }
        this.life = life;
    }
    public int setAttract(int attract) {
        if (attract < 0 || attract > 45) {
            System.out.println("信息有误！");
            return 0;
        }
        this.attract = attract;
        return attract;
    }
    public int setDefence(int defence) {
        if (defence < 0 || defence > 70) {
            System.out.println("信息有误！");
            return 0;
        }
        this.defence = defence;
        return defence;
    }

}