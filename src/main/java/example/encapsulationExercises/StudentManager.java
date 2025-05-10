package example.encapsulationExercises;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<Student>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get list of students
    public List<Student> getStudents() {
        return students;
    }

    // Get students with GPA >= 3.2
    public List<Student> getHighGpaStudents(double min) {
        List<Student> highGpaStudents = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getGpa() >= min) {
                highGpaStudents.add(student);
            }
        }
        return highGpaStudents;
    }

    // Sort students by GPA in descending order
    public void sortStudentsByGpa() {
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    }
}
