package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void test() {
        System.out.println("Testing overrided method from super");
    }

    public abstract void CalculateSalaryBonus();

}
