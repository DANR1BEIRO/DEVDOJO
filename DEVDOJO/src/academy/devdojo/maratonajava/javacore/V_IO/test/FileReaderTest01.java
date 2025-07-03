package academy.devdojo.maratonajava.javacore.V_IO.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/danielribeiro/IdeaProjects/JAVAXP/DEVDOJO/src/academy/devdojo/maratonajava/javacore/V_IO/testfile.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
