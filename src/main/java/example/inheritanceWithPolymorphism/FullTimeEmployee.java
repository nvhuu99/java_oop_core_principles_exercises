package example.inheritanceWithPolymorphism;

public class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String id, String name, double fixedSalary) {
        super(id, name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }
}

