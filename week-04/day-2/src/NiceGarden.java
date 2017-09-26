public class NiceGarden {
    public static void main(String[] args) {
        Flower yellow = new Flower();
        Flower blue = new Flower();
        yellow.name = "yellow Flower";
        blue.name = "blue Flower";
        Tree purple = new Tree();
        Tree orange = new Tree();
        orange.name = "orange Tree";
        purple.name = "purple Tree";

        Garden myGarden = new Garden();
        myGarden.addFlowers(yellow);
        myGarden.addFlowers(blue);
        myGarden.addTrees(purple);
        myGarden.addTrees(orange);

        myGarden.needsWaterFlower();
        myGarden.needsWaterTree();
        myGarden.wateringFlower(40);
        myGarden.waterinTree(40);
        myGarden.wateringFlower(70);
        myGarden.waterinTree(70);


    }

}
