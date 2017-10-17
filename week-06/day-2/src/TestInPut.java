import java.util.ArrayList;

public class TestInPut {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        Student feri = john.clone();
        people.add(john);
        people.add(feri);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);


        student.skipDays(3);


        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        PallidaClass badass = new PallidaClass("BADA55");
        badass.addStudent(student);
        badass.addStudent(john);
        badass.addMentor(mentor);
        badass.addMentor(gandhi);
        badass.info();
    }
}
