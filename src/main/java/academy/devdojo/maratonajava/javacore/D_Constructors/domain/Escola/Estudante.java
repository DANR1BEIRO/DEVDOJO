package academy.devdojo.maratonajava.javacore.D_Constructors.domain.Escola;

public class Estudante {

    private String nome;
    private int matricula;
    private String curso;
    private double notaMedia;

    /**
     * Construtor 1: Sobrecarga - Essencial (nome, matricula)
     * Objetivo: permitir criar um objeto da classe estudando com o mínimo necessário.
     * @param nome: Nome a ser atribuído ao atributo `nome`
     * @param matricula: Matrícula que será atribuída ao atributo `matricula`
     * REGRA: this() DEVE ser a primeira linha
     */
    public Estudante(String nome, int matricula) {
        // Chama o construtor 3 (o mais completo) usando o this().
        this(nome, matricula, "não definido", 0.0); // Passa os valores recebidos e valores
        // padrão para curso e notaMedia.
        // após o retorno do construtor 3, esta linha é executada:
        System.out.println(">> Construtor (nome, matricula) finalizado após chamar o Construtor 3 (completo)");
    }

    /**
     * Construtor 2: Sobrecarga - Essencial + Curso
     * Objetivo: Permitir criar um objeto do tipo Estudante informando também o curso.
     */
    public Estudante(String nome, int matricula, String curso) {
        this(nome, matricula, curso, 00); // Chama o construtor 3 (o mais completo) usando o this().
        System.out.println(">> Construtor 2 (nome, matricula, curso) finalizado após chamar o Construtor 3 (completo");
    }

    /**
     * Construtor 3: Construtor "Principal" ou "Canônico" - completo (todos os atributos)
     * Objetivo: Realizar a inicializacão efetiva dos atributos. É chamado pelos outros.
     * Como esse é o construtor "final" na cadeia de chamadas, ele não usa this()
     */
    public Estudante(String nome, int matricula, String curso, double notaMedia) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public void exibirInfo() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Nota Média: " + this.notaMedia);
        System.out.println("--------------------");
    }
}
