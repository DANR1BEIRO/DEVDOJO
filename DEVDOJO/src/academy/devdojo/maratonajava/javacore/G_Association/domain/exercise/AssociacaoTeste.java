package academy.devdojo.maratonajava.javacore.G_Association.domain.exercise;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua dos bobos, n 0");
        Aluno aluno1 = new Aluno("Naruto", 15);
        Professor sensei = new Professor("Jiraiya", "sennin");

        Aluno[] alunosSeminario = {aluno1};
        Seminario seminario = new Seminario("Como fazer o rasengan", alunosSeminario, local);

        Seminario[] seminarios = {seminario};
        sensei.setSeminarios(seminarios);
        sensei.info();


    }
}
