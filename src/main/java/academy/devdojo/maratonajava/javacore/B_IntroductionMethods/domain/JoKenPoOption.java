package academy.devdojo.maratonajava.javacore.B_IntroductionMethods.domain;

public enum JoKenPoOption {

    ROCK(1, "ROCK"),
    PAPER(2, "PAPER"),
    SCISSORS(3, "SCISSORS");

    int choose;
    String description;

    JoKenPoOption(int choose, String description) {
        this.choose = choose;
        this.description = description;
    }

    public int getChoose() {
        return choose;
    }

    public String getDescription() {
        return description;
    }

    public static JoKenPoOption fromInt(int value) {
        for (JoKenPoOption option : JoKenPoOption.values()) {
            if (option.getChoose() == value) {
                return option;
            }
        }
        return null;
    }
}
