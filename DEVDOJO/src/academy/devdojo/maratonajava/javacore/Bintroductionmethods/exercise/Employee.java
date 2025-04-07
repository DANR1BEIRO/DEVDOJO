package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercise;

public class Employee {

    String name;
    int age;
    int[] salary;

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

        int average = 0;

        for (int element : salary) {
            average += element;
        }
        average /= salary.length;
        System.out.println("\nThe salary average is R$" + average);
    }
}
