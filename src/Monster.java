public class Monster {
    private String name;
    private double challangeRating;
    private int HP;

    public Monster(String n, double cr, int hp) {
        name = n;
        challangeRating = cr;
        HP = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChallangeRating() {
        return challangeRating;
    }

    public void setChallangeRating(double challangeRating) {
        this.challangeRating = challangeRating;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public String toString() {
        return "Monster{" + name + ", " + challangeRating + ", " + HP + "}";
    }
}
