package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.test.StudentTest;

import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Student.DisplayStudent;
import academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain.Student.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        DisplayStudent student = new DisplayStudent();

        student1.name = "Yusuke";
        student1.age = 16;
        student1.gender = 'M';

        student2.name = "Sakura";
        student2.age = 16;
        student2.gender = 'F';

        student.studentInfo(student1);
        student.studentInfo(student2);
    }
}
