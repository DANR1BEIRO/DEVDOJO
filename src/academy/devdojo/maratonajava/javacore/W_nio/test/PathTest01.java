package academy.devdojo.maratonajava.javacore.W_nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/danielribeiro/JAVA/DEVDOJO/src/academy/devdojo/maratonajava/javacore/V_IO/test/testfile.txt");

        System.out.println(p1.getFileName());
        System.out.println(p1.getFileSystem());
        System.out.println(p1.isAbsolute());
    }
}
