package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.exercise;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Gaara");
        employee.setAge(16);
        employee.setSalary(new int[]{1500, 2000, 2500});
        employee.displayInfo();
        System.out.println("Average " + employee.getAverage());
    }
}
