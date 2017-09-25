public class Teacher {
    String teach;
    String answer;

    public Teacher () {

    }
    public String teach(Student student) {
        return student.learn();
    }
    public String answer () {
        return this.answer;
    }
}
