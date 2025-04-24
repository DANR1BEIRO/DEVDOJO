package academy.devdojo.maratonajava.javacore.M_Interface.domain;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from data base.");
    }

    @Override
    public void remove() {
        System.out.println("Removing from data base.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions in data base.");
    }
}
