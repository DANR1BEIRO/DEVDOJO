package academy.devdojo.maratonajava.javacore.M_Interface.domain;

public interface DataLoader {

    void load();

    default void checkPermission() {
        System.out.println("Checking permissions");
    }
}
