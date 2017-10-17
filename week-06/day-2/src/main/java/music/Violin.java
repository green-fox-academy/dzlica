package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        this.name = "Violin";
        this.numberOfStrings = 4;
    }

    @Override
    public String sound() {
        return "Screech";
    }

    public Violin(int i) {
        super();
        this.numberOfStrings = i;
        this.name = "Violin";
    }
}
