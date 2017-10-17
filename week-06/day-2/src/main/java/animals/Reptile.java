package main.java.animals;

import main.java.animals.Animal;

public class Reptile extends Animal {


    public Reptile(String reptName) {
        super();
        this.name = reptName;
    }

    @Override
    public String greet() {
        return null;
    }

    @Override
    public String wantChild() {
        return "egg";
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
