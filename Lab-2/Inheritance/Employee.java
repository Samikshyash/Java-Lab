package Inheritance;

public abstract class Employee {
    protected float hours;

    Employee(float hours) {
        this.hours = hours;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(float hours) {
        super(hours);
    }

    @Override
    void calculateSalary() {
        double salary = hours * 120;
        System.out.println("Full-time salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {

    PartTimeEmployee(float hours) {
        super(hours);
    }

    @Override
    void calculateSalary() {
        double salary = hours * 60;
        System.out.println("Part-time salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(45);
        Employee e2 = new PartTimeEmployee(23);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
