package main.java.animals;

public abstract class Animal {
    protected String name;
    int age;
    String gender;

    public abstract String greet();
    public abstract String wantChild();
    public abstract String eat();
    public abstract String play();

    public String getName() {
        return name;
    }

}
