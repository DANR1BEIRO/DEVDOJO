package academy.devdojo.maratonajava.javacore.M_Interface.test;

import academy.devdojo.maratonajava.javacore.M_Interface.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.M_Interface.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader databaseloader = new DataBaseLoader();
        FileLoader fileloader = new FileLoader();

        databaseloader.load();
        databaseloader.remove();
        fileloader.load();
        fileloader.remove();
    }
}
