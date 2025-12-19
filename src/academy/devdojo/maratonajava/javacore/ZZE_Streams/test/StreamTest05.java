package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest05 {
    static void main() {
        List<Classroom> school = List.of(
                new Classroom(List.of(
                        new Student("Goku", 4, List.of("Martial Arts", "Physics")),
                        new Student("Gohan", 9.05, List.of("Biology", "Math")),
                        new Student("Goten", 3, List.of("Martial Arts")))),
                new Classroom(List.of(
                        new Student("Tetsuo", 2, List.of("Telekinesis", "Martial Arts")),
                        new Student("Kaneda", 1, List.of("Mechanics", "Leadership")),
                        new Student("Kei", 8, List.of("Leadership", "Physics")))),
                new Classroom(List.of(
                        new Student("Mikasa", 9.5, List.of("Strategy", "Martial Arts")),
                        new Student("Levi", 10, List.of("Strategy", "Leadership")),
                        new Student("Hange", 8.8, List.of("Biology", "Leadership"))))
        );

        List<Student> allStudents = school.stream()
                .flatMap(c -> c.getStudents().stream())
                .toList();

        Map<String, List<String>> studentsBySubject = school.stream()
                .flatMap(classroom -> classroom.getStudents().stream())
                .flatMap(student -> student.getSubjects().stream()
                        .map(subject -> new AbstractMap.SimpleEntry<>(subject, student.getName())))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())
                ));

        studentsBySubject.forEach((subject, student) ->
                System.out.println(subject + ": " + student));


        boolean topStudent = allStudents.stream()
                .anyMatch(s -> s.getGrade() >= 9);
        System.out.println("\nDoes any student have a grade greater than or equal to 9?");
        System.out.println(topStudent);

        List<String> allStudentsList = allStudents.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .map(s -> s.getName() + " - Grade: " + s.getGrade())
                .toList();

        System.out.println("\nAll students filtered by grade:");
        allStudentsList.forEach(System.out::println);

        List<String> studentsWithHigherGrade = allStudents.stream()
                .filter(student -> student.getGrade() >= 9) // 1 filter
                .sorted(Comparator.comparing(Student::getGrade).reversed()) // 2 sort highest to lowest
                .map(student -> student.getName() + " - Grade: " + student.getGrade()) // 3 map to name and grade
                .toList();

        System.out.println("\nStudents with grade greater than or equal to 9:");
        studentsWithHigherGrade.forEach(System.out::println);

        boolean allGreaterThanZero = allStudents.stream()
                .allMatch(s -> s.getGrade() > 0);
        System.out.println("\nDo all students have a grade greater than 0? " + allGreaterThanZero);

        boolean noZeroGrade = allStudents.stream()
                .noneMatch(student -> student.getGrade() <= 0);
        System.out.println("Are there zero students with a grade of 0? " + noZeroGrade);


    }
}
