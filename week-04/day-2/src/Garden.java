import java.util.ArrayList;

public class Garden {
    int water;

    public ArrayList<Flower> flowers;
    public ArrayList<Tree> trees;


    public Garden() {
        flowers = new ArrayList<>();
        trees = new ArrayList<>();
    }

    public void addFlowers (Flower flower) {
        this.flowers.add(flower);
    }

    public void addTrees (Tree tree) {
        this.trees.add(tree);
    }

    public void needsWaterFlower() {
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).waterAmount < 5) {
                System.out.println("The " + flowers.get(i).name + " needs water");
            }
            else System.out.println("The " + flowers.get(i).name + " doesn't need water");
        }
    }

    public void needsWaterTree() {
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).waterAmount < 10) {
                System.out.println("The " + trees.get(i).name + " needs water");
            }
            else System.out.println("The " + trees.get(i).name + " doesn't need water");
        }
    }

    public void wateringFlower(int water) {
        System.out.println("Watering with " + water);
        for (int i = 0; i < this.flowers.size(); i++) {
            float resultFlower = 0;
            if (flowers.get(i).waterAmount < 5) {
                resultFlower = flowers.get(i).waterAmount + (water / 4) * 0.75f;
            }
            if (resultFlower < 5) {
                System.out.println("The " + flowers.get(i).name + " needs water");
            }
            else System.out.println("The " + flowers.get(i).name + " doesn't need water");

        }
    }
    public void waterinTree(int water) {
        for (int i = 0; i < this.trees.size(); i++) {
            float resultTree = 0;
            if (trees.get(i).waterAmount < 10) {
                resultTree = trees.get(i).waterAmount + (water / 4) * 0.4f;
            }
            if (resultTree < 10) {
                System.out.println("The " + trees.get(i).name + " needs water");
            }
            else System.out.println("The " + trees.get(i).name + " doesn't need water");

        }
    }


}
