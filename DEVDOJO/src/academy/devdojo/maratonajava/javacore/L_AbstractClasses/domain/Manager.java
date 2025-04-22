package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain;

public class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void CalculateSalaryBonus() {
        salary = salary + salary * 0.1;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
