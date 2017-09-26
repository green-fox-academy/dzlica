public class NiceGarden {
    public static void main(String[] args) {
        Plants yellow = new Flower();
        Plants blue = new Flower();
        yellow.name = "yellow Flower";
        blue.name = "blue Flower";
        Plants purple = new Tree();
        Plants orange = new Tree();
        orange.name = "orange Tree";
        purple.name = "purple Tree";

        Garden myGarden = new Garden();
        myGarden.add(yellow);
        myGarden.add(blue);
        myGarden.add(purple);
        myGarden.add(orange);

        myGarden.needsWater();
        myGarden.watering(40);
        myGarden.watering(70);



    }

}
