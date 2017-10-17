package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar(int i) {
        super();
        this.numberOfStrings = i;
        this.name = "Bass Guitar";
    }

    public BassGuitar() {
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

}
