package academy.devdojo.maratonajava.javacore.K_Enum.domain;

public enum CostumerType {
    INDIVIDUAL(1, "Costumer: Individual"),
    COMPANY(2, "Costumer: Company");

    public final int KEY;
    public final String VALUE;

    CostumerType(int key, String value) {
        this.KEY = key;
        this.VALUE = value;
    }
}
