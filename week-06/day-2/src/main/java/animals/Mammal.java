package main.java.animals;

import main.java.animals.Animal;

public class Mammal extends Animal {

    public Mammal(String mammalName) {
        super();
        this.name = mammalName;
    }


    @Override
    public String greet() {
        return null;
    }

    @Override
    public String wantChild() {
        return "uterus";
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String play() {
        return null;
    }
}
