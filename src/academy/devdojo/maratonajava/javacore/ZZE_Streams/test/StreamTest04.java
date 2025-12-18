package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.List;

class Classroom {
    private List<String> students;

    public Classroom(List<String> students) {
        this.students = students;
    }

    public List<String> getStudents() {
        return students;
    }
}

public class StreamTest04 {
    static void main() {
        List<Classroom> school = List.of(
                new Classroom(List.of("Goku", "Gohan", "Goten")),
                new Classroom(List.of("Tetsuo", "Kaneda", "Kei")),
                new Classroom(List.of("Mikasa", "Levi", "Hange"))
        );

        // drill down and flatten the structure
        List<String> allStudents = school.stream()
                .peek(classroom -> System.out.println("\nOpening the classroom:")) // peek at the container before flattening
                .flatMap(classroom -> classroom.getStudents().stream())
                .peek(student -> System.out.println("Found the student " + student)) // peek at the individual elements after they are extracted
                .sorted()
                .toList();

        System.out.println("\nAll students:");
        allStudents.forEach(System.out::println);
        // System.out.println(allStudents);
    }
}
