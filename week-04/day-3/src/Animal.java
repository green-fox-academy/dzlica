public class Animal {
    int hunger;
    int thirst;


    public Animal(int hunger, int thirst) {
        this.hunger = 50;
        this.thirst = 50;
    }


    public void eat() {
        this.hunger += 1;
    }
    public void dring() {
        this.thirst += 1;
    }
    public void play() {
        this.thirst -= 1;
        this.hunger -= 1;
    }
    public static void main(String[] args) {
        Animal lion = new Animal(50, 50);
        Animal zebra = new Animal(50, 50);
        Animal giraffe = new Animal(50, 50);

        lion.eat();
        zebra.dring();
        giraffe.play();

        System.out.println("The lions hunger value is " + lion.hunger);
        System.out.println("The zebras thirst value is " + zebra.thirst);
        System.out.println("The giraffe hunger and thirst value is " + giraffe.hunger + " " + giraffe.thirst);
    }
}



