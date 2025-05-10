package example.inheritanceWithPolymorphism;

public class PartTimeEmployee extends Employee {
    private int hoursWorked = 0;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    public void addWorkHours(int hours) {
        if (hours > 0) {
            this.hoursWorked += hours;
        }
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
