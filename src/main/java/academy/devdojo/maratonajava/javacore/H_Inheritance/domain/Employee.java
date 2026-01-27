package academy.devdojo.maratonajava.javacore.H_Inheritance.domain;

public class Employee extends Person {
    private double salary;

    static {
        System.out.println("Inside the static initialization block of Employee (subclass)");
    }

    {
        System.out.println("Non-static initialization block of Employee (subclass) 1");
    }

    {
        System.out.println("Non-static initialization block of Employee (subclass) 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Inside the constructor of Employee (subclass)");
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

