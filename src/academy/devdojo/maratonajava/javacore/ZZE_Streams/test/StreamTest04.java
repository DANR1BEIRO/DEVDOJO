package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.Comparator;
import java.util.List;

public class StreamTest04 {
    static void main() {
        List<Classroom> school = List.of(
                new Classroom(List.of(
                        new Student("Goku", 7, List.of("Artes Marciais", "Física")),
                        new Student("Gohan", 5, List.of("Biologia", "Matemática")),
                        new Student("Goten", 3, List.of("Artes Marciais")))),
                new Classroom(List.of(
                        new Student("Tetsuo", 2, List.of("Poderes Psíquicos")),
                        new Student("Kaneda", 1, List.of("Mecânica")),
                        new Student("Kei", 8, List.of("Liderança", "Física")))),
                new Classroom(List.of(
                        new Student("Mikasa", 9.5, List.of("Estratégia", "Artes Marciais")),
                        new Student("Levi", 10, List.of("Estratégia", "Liderança")),
                        new Student("Hange", 4, List.of("Ciência"))))
        );

        List<String> allSubjects = school.stream()
                .flatMap(classroom -> classroom.getStudents().stream())
                .filter(student -> student.getGrade() >= 5)
                .flatMap(student -> student.getSubjects().stream())
                .distinct()
                .sorted()
                .toList();

        allSubjects.forEach(System.out::println);

        // drill down and flatten the structure
        List<Student> allStudents = school.stream()
                .peek(classroom -> System.out.println("\nOpening the classroom:")) // peek at the container before flattening
                .flatMap(classroom -> classroom.getStudents().stream())
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
    private List<String> subjects;

    public Student(String name, double grade, List<String> subjects) {
        this.name = name;
        this.grade = grade;
        this.subjects = subjects;
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

    public List<String> getSubjects() {
        return subjects;
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
