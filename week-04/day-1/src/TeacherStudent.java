public class TeacherStudent {
    public static void main (String[] args) {
        Student Joe = new Student();
        Teacher Tom = new Teacher();
        Teacher Bob = new Teacher();

        Joe.learn = "Is it an appe?";
        Bob.answer = "Yes, it is";
        Tom.answer = "No, it isn't";

        Joe.question(Tom);
        Tom.teach(Joe);

        System.out.println(Joe.question(Tom));
        System.out.println(Joe.question(Bob));



    }

}
