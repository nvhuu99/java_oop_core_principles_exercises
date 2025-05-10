package example.lms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewGrades() {
        System.out.printf("| %-15s | %-15s |\n", "Course", "Grade");
        for (Course course : enrolledCourses) {
            Double grade = course.getGrade(this);
            System.out.printf("| %-15s | %-15.2f |\n", course.getTitle(), grade != null ? grade : 0.0);
        }
    }

    @Override
    public void login() {
        System.out.println("Student " + name + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Student " + name + " has logged out.");
    }
}
