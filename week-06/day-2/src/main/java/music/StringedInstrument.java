package main.java.music;

public abstract class StringedInstrument extends Instrument {
    public int numberOfStrings;
    public abstract String sound();


    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + this.sound());
    }
}
