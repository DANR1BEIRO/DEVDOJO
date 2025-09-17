package academy.devdojo.maratonajava.javacore.W_NIO.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**/*.{bkp,txt,java}"); // agrupa por extensões. NÃO PODE TER ESPACO ENTRE ELAS
        matches(path1, "glob:*.???"); // ?: retorna arquivos com extensões que tenham a mesma quantidade de letras que '?'
        matches(path1, "glob:**/file.???"); // Retorna o NOME DO ARQUIVO, independentemente da extensão

    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
