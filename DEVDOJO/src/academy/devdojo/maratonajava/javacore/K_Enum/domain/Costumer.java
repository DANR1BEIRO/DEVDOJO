package academy.devdojo.maratonajava.javacore.K_Enum.domain;

public class Costumer {
    private String name;
    private CostumerType costumerType;

    public Costumer(String name, CostumerType costumerType) {
        this.name = name;
        this.costumerType = costumerType;
    }

    @Override
    public String   toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", costumerType=" + costumerType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CostumerType getCostumerType() {
        return costumerType;
    }

    public void setCostumerType(CostumerType costumerType) {
        this.costumerType = costumerType;
    }
}
