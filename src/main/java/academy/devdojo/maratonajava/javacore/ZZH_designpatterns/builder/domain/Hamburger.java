package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.builder.domain;

public class Hamburger {
    private final String bun;
    private final String patty;
    private final String cheese;
    private final String tomato;
    private final String lettuce;
    private final String bacon;
    private final String pickles;

    private Hamburger(String bun, String patty, String cheese, String tomato, String lettuce, String bacon, String pickles) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.tomato = tomato;
        this.lettuce = lettuce;
        this.bacon = bacon;
        this.pickles = pickles;
    }

    // toString personalized to display only valid fields
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Builded Hamburger: ");
        sb.append("\nBun: ").append(bun);
        sb.append("\nPatty: ").append(patty);
        appendIfNotNull(sb, "\nCheese: ", cheese);
        appendIfNotNull(sb, "\nTomato: ", tomato);
        appendIfNotNull(sb, "\nLettuce: ", lettuce);
        appendIfNotNull(sb, "\nBacon: ", bacon);
        appendIfNotNull(sb, "\nPickles: ", pickles);
        return sb.toString();
    }

    // void method to check if an attribute is valid
    private void appendIfNotNull(StringBuilder stringBuilder, String prefix, String value) {
        if (value != null && !value.isEmpty()) {
            stringBuilder.append(prefix).append(value);
        }
    }

    public static class Builder {
        private final String bun;
        private final String patty;
        private String cheese;
        private String tomato;
        private String lettuce;
        private String bacon;
        private String pickles;

        private Builder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public static Builder builder(String bun, String patty) {
            return new Builder(bun, patty);
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder tomato(String tomato) {
            this.tomato = tomato;
            return this;

        }

        public Builder lettuce(String lettuce) {
            this.lettuce = lettuce;
            return this;

        }

        public Builder bacon(String bacon) {
            this.bacon = bacon;
            return this;

        }

        public Builder pickles(String pickles) {
            this.pickles = pickles;
            return this;
        }

        public Hamburger build() {
            if (bun == null || bun.isEmpty()) {
                throw new IllegalStateException("O hamburger precisa de pão");
            }
            return new Hamburger(bun, patty, cheese, tomato, lettuce, bacon, pickles);

        }
    }
}
