package academy.devdojo.maratonajava.javacore.V_IO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/danielribeiro/IdeaProjects/JAVAXP/DEVDOJO/src/academy/devdojo/maratonajava/javacore/V_IO/testfile.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("hello world\n");
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
