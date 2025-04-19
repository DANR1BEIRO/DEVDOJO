package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name) {
        super(name);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Salary: " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

