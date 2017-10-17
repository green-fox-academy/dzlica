import java.util.ArrayList;
import java.util.List;

public class PallidaClass {
    String className;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public PallidaClass(String className) {
        students = new ArrayList<>();
        mentors = new ArrayList<>();
        this.className = className;
    }

    public void addStudent(Student Student) {
        this.students.add(Student);
    }

    public void addMentor(Mentor Mentor) {
        this.mentors.add(Mentor);
    }

    public void info() {
        System.out.println("Pallida " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
 }
