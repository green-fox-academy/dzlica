public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie (String color, float width) {
        this.inkAmount = 100;
        this.color = color;
        this.width = width;
    }

    public void use(int count) {
        this.inkAmount -= (count * 5);
    }

    @Override
    public String toString() {
        return this.color + " " + this.inkAmount;
    }

    public static void main(String[] args) {
        Sharpie one = new Sharpie("red", 200);
        Sharpie two = new Sharpie("black", 100);
        Sharpie three = new Sharpie("yellow", 50);

        one.use(2);
        one.use(1);
        two.use(3);
        three.use(5);

        System.out.println("Sharpie named one: " + one.inkAmount);
        System.out.println("Sharpie named two: " + two.inkAmount);
        System.out.println("Sharpie named three: " + three.inkAmount);
    }
}
