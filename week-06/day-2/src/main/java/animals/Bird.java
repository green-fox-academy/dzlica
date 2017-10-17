package main.java.animals;

import main.java.animals.Animal;

public class Bird extends Animal {

    public Bird(String birdName) {
        this.name = birdName;
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
