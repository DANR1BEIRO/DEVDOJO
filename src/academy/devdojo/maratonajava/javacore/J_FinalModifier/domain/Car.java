package academy.devdojo.maratonajava.javacore.J_FinalModifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT = 250;
    public final Buyer BUYER = new Buyer();

    // metodo final jamais poderá ser sobrescrito
    public final void info() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
