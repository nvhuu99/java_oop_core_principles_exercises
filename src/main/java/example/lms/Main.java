package example.lms;

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();

        Instructor inst1 = new Instructor("I1", "Tùng", "tung@example.com");
        Student stu1 = new Student("S1", "Lan", "lan@example.com");
        Student stu2 = new Student("S2", "Hưng", "hung@example.com");

        lms.addInstructor(inst1);
        lms.addStudent(stu1);
        lms.addStudent(stu2);

        lms.createCourse("I1", "C101", "OOP in Java");
        lms.enrollStudent("S1", "C101");
        lms.enrollStudent("S2", "C101");

        lms.gradeStudent("I1", "C101", "S1", 8.5);
        lms.gradeStudent("I1", "C101", "S2", 9.0);

        lms.printGrades("C101");
    }
}
