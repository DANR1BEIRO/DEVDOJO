package academy.devdojo.maratonajava.javacore.K_Enum.domain;

public class Costumer {

    private String name;
    private CostumerType costumerType;
    private PaymentType paymentType;

    public Costumer(String name, CostumerType costumerType, PaymentType paymentType) {
        this.name = name;
        this.costumerType = costumerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", costumerType=" + costumerType +
                ", costumerTypeInt=" + costumerType.KEY +
                ", costumerTypeDescription=" + costumerType.VALUE +
                ", paymentType=" + paymentType +
                '}';
    }
}
