package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int i) {
        super();
        this.name = "Electric Guitar";
        this.numberOfStrings = i;

    }

    @Override
    public String sound() {
        return "Twang";
    }



}
