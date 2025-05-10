package example.encapsulationExercises;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a student manager
        StudentManager manager = new StudentManager();

        // Prompt user for the number of students to generate
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline left over

        // Random data generation
        Random random = new Random();
        String[] sampleNames = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah"};
        String[] sampleIds = {"S001", "S002", "S003", "S004", "S005", "S006", "S007", "S008"};

        for (int i = 0; i < n; i++) {
            // Generate random student data
            String id = sampleIds[random.nextInt(sampleIds.length)];
            String name = sampleNames[random.nextInt(sampleNames.length)];
            int age = 18 + random.nextInt(10);  // Random age between 18 and 27
            double gpa = 2.0 + (4.0 - 2.0) * random.nextDouble();  // Random GPA between 2.0 and 4.0

            // Add the student to the manager
            manager.addStudent(new Student(id, name, age, gpa));
        }

        // Display students with GPA >= 3.2
        System.out.println("\nStudents with GPA >= 3.2:");
        System.out.printf("%-10s %-20s %-5s %-5s\n", "ID", "Name", "Age", "GPA");
        System.out.println("---------------------------------------------");
        for (Student student : manager.getHighGpaStudents(3.2)) {
            System.out.println(student);
        }

        // Sort and display students by GPA (descending)
        manager.sortStudentsByGpa();
        System.out.println("\nStudents sorted by GPA (Descending):");
        System.out.printf("%-10s %-20s %-5s %-5s\n", "ID", "Name", "Age", "GPA");
        System.out.println("---------------------------------------------");
        for (Student student : manager.getStudents()) {
            System.out.println(student);
        }
    }
}

