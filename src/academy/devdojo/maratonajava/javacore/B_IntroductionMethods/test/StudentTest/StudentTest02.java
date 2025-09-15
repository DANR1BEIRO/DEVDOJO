package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.StudentTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Student.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Jiraiya";
        student1.age = 16;
        student1.gender = 'M';

        student2.name = "Tsunade";
        student2.age = 16;
        student2.gender = 'F';

        student1.displayThis();
        student2.displayThis();
    }
}
