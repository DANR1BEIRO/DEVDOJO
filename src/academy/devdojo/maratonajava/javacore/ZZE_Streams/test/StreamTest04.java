package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.Comparator;
import java.util.List;

public class StreamTest04 {
    static void main() {
        List<Classroom> school = List.of(
                new Classroom(List.of(
                        new Student("Goku", 7),
                        new Student("Gohan", 5),
                        new Student("Goten", 3))),
                new Classroom(List.of(
                        new Student("Tetsuo", 2),
                        new Student("Kaneda", 1),
                        new Student("Kei", 8))),
                new Classroom(List.of(
                        new Student("Mikasa", 9.5),
                        new Student("Levi", 10),
                        new Student("Hange", 4)))
        );

        // drill down and flatten the structure
        List<Student> allStudents = school.stream()
                .peek(classroom -> System.out.println("\nOpening the classroom:")) // peek at the container before flattening
                .flatMap(classroom -> classroom.getStudents().stream())
                .filter(student -> student.getGrade() >= 5)
                .peek(student -> System.out.println("Found the student " + student.getName())) // peek at the individual elements after they are extracted
                .sorted(Comparator.comparing(Student::getName))
                .toList();

        System.out.println("\nAll students:");
        allStudents.forEach(System.out::println);
        // System.out.println(allStudents);
    }
}

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class Classroom {
    private List<Student> students;

    public Classroom(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
