package example.lms;

import java.util.*;

public class LMS {
    private Map<String, Instructor> instructors = new HashMap<>();
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();

    public void addInstructor(Instructor instructor) {
        instructors.put(instructor.getId(), instructor);
    }

    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            System.err.println("Error: Student with ID " + student.getId() + " already exists.");
            return;
        }
        students.put(student.getId(), student);
    }

    public void createCourse(String instructorId, String courseId, String title) {
        if (courses.containsKey(courseId)) {
            System.err.println("Error: Course with ID " + courseId + " already exists.");
            return;
        }

        Instructor instructor = instructors.get(instructorId);
        if (instructor == null) {
            System.err.println("Error: Instructor with ID " + instructorId + " does not exist.");
            return;
        }

        Course course = instructor.createCourse(courseId, title);
        courses.put(courseId, course);
    }

    public void enrollStudent(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student == null) {
            System.err.println("Error: Student with ID " + studentId + " does not exist.");
            return;
        }

        if (course == null) {
            System.err.println("Error: Course with ID " + courseId + " does not exist.");
            return;
        }

        if (course.getStudents().contains(student)) {
            System.err.println("Error: Student " + student.getName() + " is already enrolled in course " + course.getTitle() + ".");
            return;
        }

        student.enrollCourse(course);
    }

    public void gradeStudent(String instructorId, String courseId, String studentId, double grade) {
        Instructor instructor = instructors.get(instructorId);
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (instructor != null && student != null && course != null) {
            instructor.gradeStudent(course, student, grade);
        }
    }

    public void printGrades(String courseId) {
        Course course = courses.get(courseId);
        if (course != null) {
            System.out.printf("Gradebook for course: %s\n", course.getTitle());
            System.out.printf("| %-15s | %-15s |\n", "Student", "Grade");
            for (Student student : course.getStudents()) {
                Double grade = course.getGrade(student);
                System.out.printf("| %-15s | %-15.2f |\n", student.getName(), grade != null ? grade : 0.0);
            }
        }
    }
}
