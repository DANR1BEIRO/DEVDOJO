package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        // Caminho relativo
        Path dir = Paths.get("home/daniel");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/daniel");
        Path relativo = Paths.get("dev");
        Path file1 = Paths.get("aqueleArquivo.txt");

        System.out.println("1: " + absoluto.resolve(relativo));
        System.out.println("2: " + absoluto.resolve(file1));
        System.out.println("3: " + relativo.resolve(absoluto));
        System.out.println("4: " + relativo.resolve(file1));
        System.out.println("5: " + file1.resolve(absoluto));
        System.out.println("6: " + file1.resolve(relativo));
    }
}
