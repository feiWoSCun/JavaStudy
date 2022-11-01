
public class Equipement {
    public  Equipement(String name, int attract, int defence) {
      this.defence=defence;
    }

    public Equipement() {

    }

    private String name;
    private int attract;
    private int defence;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttract() {
        return attract;
    }

    public void setAttract(int attract) {
        this.attract = attract;
    }

    public  int getDefence() {
        return defence;
    }
    public void setDefence(int fangyu) {
this.defence=fangyu;
    }

}




