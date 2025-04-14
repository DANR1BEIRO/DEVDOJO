package academy.devdojo.maratonajava.javacore.D_Constructors.domain.Escola;

public class Escola {
    public static void main(String[] args) {
        System.out.println("Criando Estudante 1 (Construtor 1 -> Construtor 3):");
        Estudante est1 = new Estudante("Goku", 8001);
        est1.exibirInfo();

        System.out.println("Criando Estudante 2 (Construtor 2 -> Construtor 3):");
        Estudante est2 = new Estudante("Vegeta", 0001, "Sayajins");
        est2.exibirInfo();

        System.out.println("Criando Estudante 3 (Construtor 3 direto):");
        Estudante est3 = new Estudante("Bulma", 0002, "Capsule Corp", 10);
        est3.exibirInfo();

    }
}
