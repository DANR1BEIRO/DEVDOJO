package academy.devdojo.maratonajava.javacore.G_Association.domain;

public class Ninja {
    private String name;
    private String element;
    private Team7 team7;

    // association: the ninja knows
    // which team they belong to
    public void info() {
        System.out.println("__________________________");
        System.out.println("Ninja name: " + this.name);
        if (team7 != null) {
            System.out.println("Belong to " + team7.getName());
        }
    }

    public Ninja(String name, String element, Team7 team7) {
        this.name = name;
        this.element = element;
        this.team7 = team7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Team7 getTeam7() {
        return team7;
    }

    public void setTeam7(Team7 team7) {
        this.team7 = team7;
    }
}



