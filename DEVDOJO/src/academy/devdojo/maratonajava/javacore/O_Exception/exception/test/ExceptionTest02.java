package academy.devdojo.maratonajava.javacore.O_Exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    public static void createNewFile() throws IOException {
        File file = new File("testFile\\test01.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);
        } catch (IOException e) {
            // JAMAIS DEIXE O BLOCK CATCH EM BRANCO
            // NÃO COLOQUE LÓGICA DE NEGÓCIO NO CATCH
            e.printStackTrace();
            throw e;
        }
    }
}
