package example.inheritanceWithPolymorphism;

public abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

