package academy.devdojo.maratonajava.javacore.ZZE_Streams.test;

import java.util.List;

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
