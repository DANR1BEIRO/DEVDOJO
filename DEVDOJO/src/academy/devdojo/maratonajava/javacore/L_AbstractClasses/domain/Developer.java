package academy.devdojo.maratonajava.javacore.L_AbstractClasses.domain;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void CalculateSalaryBonus() {
        salary = salary + salary * 0.05;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
