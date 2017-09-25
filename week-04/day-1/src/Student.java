public class Student {
    String learn;
    String question;

    public Student (){

    }

    public String learn() {
        return this.learn;

    }
    public String question(Teacher teacher) {
        return teacher.answer();
    }
}
