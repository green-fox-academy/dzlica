public class Car {
    String types;
    String colors;

    public Car() {
        this.types = getARandomType();
        this.colors = getARandomColor();
    }

    public Car(String[] args) {

    }

    public enum carTypes {MINI, LANCIA, OPEL, FORD, PEUGEOT}
    public enum carColors {RED, GREEN, PURPLE, PINK}


    public String getARandomType() {
        return carTypes.values()[(int)(Math.random() * (carTypes.values().length))].toString();
    }

    public String getARandomColor() {
        return carColors.values()[(int)(Math.random() * (carColors.values().length))].toString();
    }

    @Override
    public String toString() {
        return types + " : " + colors;
    }
}
