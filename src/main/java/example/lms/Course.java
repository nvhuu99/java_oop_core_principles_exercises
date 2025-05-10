package example.lms;

import java.util.*;

public class Course {
    private String courseId;
    private String title;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();
    private Map<Student, Double> grades = new HashMap<>();

    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void setGrade(Student student, double grade) {
        grades.put(student, grade);
    }

    public Double getGrade(Student student) {
        return grades.get(student);
    }

    public String getTitle() { return title; }
    public String getCourseId() { return courseId; }
    public Instructor getInstructor() { return instructor; }

    public List<Student> getStudents() { return students; }
}
