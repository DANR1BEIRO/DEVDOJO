package academy.devdojo.maratonajava.javacore.M_Interface.domain;

public class DataBaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from data base");
    }
}
