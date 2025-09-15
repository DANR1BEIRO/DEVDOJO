package academy.devdojo.maratonajava.javacore.V_IO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        File novaPasta = new File("pasta");
        boolean isPastaCriada = novaPasta.mkdir();
        System.out.println("Pasta criada: " + isPastaCriada);

        File novoArquivo = new File(novaPasta, "V1_arquivo.txt");
        boolean isArquivoCriado = novoArquivo.createNewFile();
        System.out.println("Arquivo criado: " + isArquivoCriado);

        File arquivoRenomeado = new File(novaPasta, "V2_arquivo.txt");
        boolean isArquivoRenomeado = arquivoRenomeado.createNewFile();
        System.out.println("Arquivo renomeado: " + isArquivoRenomeado);

        File pastaRenomeada = new File("pasta2");
        boolean isPastaRenomeada = novaPasta.renameTo(pastaRenomeada);
        System.out.println("Pasta renomeada: " + isPastaRenomeada);
        pastaRenomeada.renameTo(new File("pasta3"));
    }
}


















