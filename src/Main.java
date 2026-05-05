import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static void main(String[] args) throws FileNotFoundException {
        MonsterUtility utility = new MonsterUtility();

        File file = new File("monsters.csv");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(",");
            Monster m = new Monster(lineArray[0], Double.parseDouble( lineArray [2]), Integer.parseInt(lineArray[4]));
            utility.addMonster(m);
        }
        System.out.println(utility.tostring());
        System.out.println(utility.getNameLargestHP());
        System.out.println(utility.getNameSmallestHP());
        System.out.println(utility.getByChallangeRating(4.0));
        System.out.println(utility.getByHP(200));
        System.out.println(utility.sortByHP());
        System.out.println(utility.sortByChallangeRating());
    }
}
