package example.inheritanceWithPolymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Thêm nhân viên FullTime
        employees.add(new FullTimeEmployee("F001", "Alice", 1200.0));
        employees.add(new FullTimeEmployee("F002", "Bob", 1500.0));

        // Tạo nhân viên PartTime và cộng dồn giờ làm
        PartTimeEmployee charlie = new PartTimeEmployee("P001", "Charlie", 10.0);
        charlie.addWorkHours(40);
        charlie.addWorkHours(20); // Tổng 60 giờ

        PartTimeEmployee daisy = new PartTimeEmployee("P002", "Daisy", 12.0);
        daisy.addWorkHours(50); // Tổng 50 giờ

        employees.add(charlie);
        employees.add(daisy);

        // In tiêu đề
        System.out.printf("%-6s %-10s %-15s %-10s %-6s\n", "Type", "ID", "Name", "Salary", "Hours");
        System.out.println("----------------------------------------------------------");

        double totalSalary = 0;

        for (Employee e : employees) {
            String type = (e instanceof FullTimeEmployee) ? "Full" : "Part";
            double salary = e.calculateSalary();
            totalSalary += salary;

            String hoursStr = "";
            if (e instanceof PartTimeEmployee pte) {
                hoursStr = String.valueOf(pte.getHoursWorked());
            }

            System.out.printf("%-6s %-10s %-15s %-10.2f %-6s\n",
                    type, e.getId(), e.getName(), salary, hoursStr);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("Total Salary: %.2f\n", totalSalary);
    }
}


