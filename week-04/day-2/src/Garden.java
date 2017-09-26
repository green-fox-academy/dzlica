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
        for (int i = 0; i < this.plants.size(); i++) {
            if (this.plants.get(i).waterAmount < this.plants.get(i).waterneed) {
                System.out.println("The " + this.plants.get(i).name + " needs water");
            }
            else System.out.println("The " + this.plants.get(i).name + " doesn't need water");
        }
    }


    public void watering(int water) {
        System.out.println("Watering with " + water);
        for (int i = 0; i < this.plants.size(); i++) {
            float resultFlower = 0;
            if (this.plants.get(i).waterAmount < this.plants.get(i).waterneed) {
                resultFlower = this.plants.get(i).waterAmount + (water / this.plants.size()) * this.plants.get(i).increase;
            }
            if (resultFlower < this.plants.get(i).waterneed) {
                System.out.println("The " + this.plants.get(i).name + " needs water");
            }
            else System.out.println("The " + this.plants.get(i).name + " doesn't need water");

        }
    }


}
