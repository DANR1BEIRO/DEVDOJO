package academy.devdojo.maratonajava.javacore.G_Association.test;

import academy.devdojo.maratonajava.javacore.G_Association.domain.College;
import academy.devdojo.maratonajava.javacore.G_Association.domain.Professor;

public class CollegeTest01 {
    public static void main(String[] args) {
        Professor sensei1 = new Professor("Jiraiya");
        Professor sensei2 = new Professor("Kakashi");
        Professor[] professors = {sensei1, sensei2};
        College college = new College("Konoha", professors);

        college.info();
    }
}
