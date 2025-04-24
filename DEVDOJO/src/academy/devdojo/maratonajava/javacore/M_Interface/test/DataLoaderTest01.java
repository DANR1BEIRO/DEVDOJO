package academy.devdojo.maratonajava.javacore.M_Interface.test;

import academy.devdojo.maratonajava.javacore.M_Interface.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.M_Interface.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.M_Interface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataLoader databaseloader = new DataBaseLoader();
        DataLoader fileloader = new FileLoader();

        databaseloader.load();
        fileloader.load();
    }
}
