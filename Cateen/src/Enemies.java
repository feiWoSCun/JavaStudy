
class Enemies{
    private String name;
    private String life;
    private int attract;
    private int defence;
    public  Enemies(String name,String life,int attract,int defence) {
        this.setName(name);
        this.setLife(life);
        this.setAttract(attract);
        this.setDefence(defence);
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getLife(){
        return life;
    }
    public void setLife(String i){
        life=i;
    }
    public int getAttract(){
        return attract;
    }
    public int setAttract(int j){
        attract=j;
        return attract;
    }
    public int getDefence(){
        return defence;
    }
    public int setDefence(int b){
        defence=b;
        return defence;
    }
    public void enemy(){
        System.out.println(name +"生命值是"+" "+life+" "+"攻击力是:"
                +attract+" "+"防御力是:"+defence);
    }


public static void chaseEnemies(int d){
        switch(d) {
                case (1):
                Enemies enemies1 =new Enemies("卷王王中泰", "70", 6, 18);
                enemies1.enemy();
                break;
            case(2):
                Enemies enemies2 = new Enemies("卷王廖俊枭", "70", 6, 18);
                enemies2.enemy();
                break;
            case(3):
                Enemies enemies3 = new Enemies("卷王王兮姐姐", "70", 6, 18);
                enemies3.enemy();
                break;
                }
    }
}