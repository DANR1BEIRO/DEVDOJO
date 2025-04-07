package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void displayThis() {
        System.out.println("\nDisplay this:");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
