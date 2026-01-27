package academy.devdojo.maratonajava.javacore.ZZH_designpatterns.factory.domain;

public interface Currency {
    String getSimbol();
}

class Real implements Currency {
    public String getSimbol() {
        return "R$";
    }
}

class UsDollar implements Currency {
    @Override
    public String getSimbol() {
        return "$";
    }
}
