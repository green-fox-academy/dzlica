import java.util.ArrayList;

public class Garden {


    public ArrayList<Plants> plants;


    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void add (Plants plants) {
        this.plants.add(plants);
    }


    public void needsWater() {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).waterAmount < plants.get(i).waterneed) {
                System.out.println("The " + plants.get(i).name + " needs water");
            }
            else System.out.println("The " + plants.get(i).name + " doesn't need water");
        }
    }


    public void watering(int water) {
        System.out.println("Watering with " + water);
        for (int i = 0; i < this.plants.size(); i++) {
            float resultFlower = 0;
            if (plants.get(i).waterAmount < plants.get(i).waterneed) {
                resultFlower = plants.get(i).waterAmount + (water / 4) * plants.get(i).increase;
            }
            if (resultFlower < 5) {
                System.out.println("The " + plants.get(i).name + " needs water");
            }
            else System.out.println("The " + plants.get(i).name + " doesn't need water");

        }
    }


}
