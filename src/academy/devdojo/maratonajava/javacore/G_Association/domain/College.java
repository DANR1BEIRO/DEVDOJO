package academy.devdojo.maratonajava.javacore.G_Association.domain;

public class College {
    private String name;
    private Professor[] professors;

    public College(String name) {
        this.name = name;
    }

    public College(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void info() {
        System.out.println("College: " + this.name);
        if (professors == null) return;
        for (Professor professor : professors) {
            System.out.println("Professor: " + professor.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
