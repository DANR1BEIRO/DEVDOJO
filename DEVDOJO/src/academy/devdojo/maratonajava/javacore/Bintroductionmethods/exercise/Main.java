package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercise;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Gaara";
        employee.age = 16;
        employee.salary = new int[]{1500, 2000, 2500};
        employee.displayInfo();
    }
}
