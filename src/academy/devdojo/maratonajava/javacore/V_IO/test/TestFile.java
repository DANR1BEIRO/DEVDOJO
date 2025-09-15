package academy.devdojo.maratonajava.javacore.V_IO.test;


import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("testFile.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Studying file with Java");
            bufferedWriter.newLine();
            bufferedWriter.write("Java and JavaScript are NOT the same thing");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
