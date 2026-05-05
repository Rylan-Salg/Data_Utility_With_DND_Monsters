import java.util.ArrayList;

public class MonsterUtility {
    private final ArrayList<Monster> monsters;

    public MonsterUtility() {
        monsters = new  ArrayList<>();
    }

    public void addMonster(Monster m) {
        monsters.add(m);
    }

    public String getNameLargestHP(){
        Monster max = monsters.getFirst();
        for (int i = 0; i< monsters.size(); i++){
            if (monsters.get(i).getHP() > max.getHP()){
                max = monsters.get(i);
            }
        }
        return max.getName();
    }

    public String getNameSmallestHP(){
        Monster min = monsters.getFirst();
        for (int i = 0; i< monsters.size(); i++){
            if (monsters.get(i).getHP() < min.getHP()){
                min = monsters.get(i);
            }
        }
        return min.getName();
    }

    public ArrayList<Monster> getByChallangeRating(double cr) {
        ArrayList<Monster> output = new ArrayList<>();
            for (int i = 0; i< monsters.size(); i++) {
                if (monsters.get(i).getChallangeRating() == cr) {
                    output.add(monsters.get(i));
                }
            }
        return output;
    }

    public ArrayList<Monster> getByHP(int hp){
        ArrayList<Monster> output = new ArrayList<>();
        for (int i = 0; i< monsters.size(); i++){
            if (monsters.get(i).getHP() == hp){
                output.add(monsters.get(i));
            }
        }
        return output;
    }

    public ArrayList<Monster> sortByHP(){
        ArrayList<Monster> output = monsters;
        for (int j = 0; j < output.size(); j++) {
            for (int i = 0; i < output.size(); i++) {
                if (output.get(i) == output.getLast()) {
                    break;
                }
                else if (output.get(i).getHP() < output.get(i + 1).getHP()) {
                    Monster temp = output.get(i);
                    output.set(i, output.get(i + 1));
                    output.set(i + 1, temp);
                }
            }
        }
        return output;
    }

    public ArrayList<Monster> sortByChallangeRating(){
        ArrayList<Monster> output = monsters;
        for (int j = 0; j < output.size(); j++) {
            for (int i = 0; i < output.size(); i++) {
                if (output.get(i) == output.getLast()) {
                    break;
                }
                else if (output.get(i).getChallangeRating() > output.get(i + 1).getChallangeRating()) {
                    Monster temp = output.get(i);
                    output.set(i, output.get(i + 1));
                    output.set(i + 1, temp);
                }
            }
        }
        return output;
    }

    public String tostring(){
        String output = "";
        for (int i = 0; i < monsters.size(); i++) {
            output += monsters.get(i).toString() + ", ";
        }
        output += "}";
        return output;
    }
}
