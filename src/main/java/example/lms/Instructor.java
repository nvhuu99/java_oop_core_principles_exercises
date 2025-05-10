package example.lms;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
    private List<Course> courseList = new ArrayList<>();

    public Instructor(String id, String name, String email) {
        super(id, name, email);
    }

    public Course createCourse(String courseId, String title) {
        Course course = new Course(courseId, title, this);
        courseList.add(course);
        return course;
    }

    public void gradeStudent(Course course, Student student, double grade) {
        course.setGrade(student, grade);
    }

    @Override
    public void login() {
        System.out.println("Instructor " + name + " has logged in.");
    }

    @Override
    public void logout() {
        System.out.println("Instructor " + name + " has logged out.");
    }
}
