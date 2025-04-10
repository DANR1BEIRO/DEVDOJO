package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.exercise;

public class Employee {

    private String name;
    private int age;
    private int[] salary;
    private double average;

    public void displayInfo() {

        System.out.println("Employee's name: " + this.name);
        System.out.println("Employee's age: " + this.age);

        if (salary == null) {
            return;
        }

        int count = 0;
        for (int element : salary) {
            if (count == salary.length - 1) {
                System.out.print("R$" + element + ".");
            } else {
                System.out.print("R$" + element + ", ");
            }
            count++;
        }
        calculateAverage();
    }

    public void calculateAverage() {
        if (salary == null) {
            return;
        }
        for (int element : salary) {
            average += element;
        }
        average /= salary.length;
        System.out.println("\nThe salary average is R$" + average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public double getAverage() {
        return average;
    }
}
