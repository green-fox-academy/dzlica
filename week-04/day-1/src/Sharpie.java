public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie (String color, float width) {
        this.inkAmount = 100;
    }
    public void use() {
        this.inkAmount -= 5;
    }
    public static void main(String[] args) {
        Sharpie one = new Sharpie("red", 200);
        Sharpie two = new Sharpie("black", 100);
        Sharpie three = new Sharpie("yellow", 50);

        one.use();
        one.use();
        two.use();
        three.use();

        System.out.println("Sharpie named one: " + one.inkAmount);
        System.out.println("Sharpie named two: " + two.inkAmount);
        System.out.println("Sharpie named three: " + three.inkAmount);
    }
}
