package academy.devdojo.maratonajava.javacore.X_Serializable.domain;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 1925164339390800230L;
    private Long id;
    private String name;
    private transient String password;
    private transient Turma turma;

    /**
     * Atributos static não pertencem ao objeto, mas sim à classe;
     * Portanto não são serializados
     */
    private static final String NOME_ESCOLA = "DevDojo";

    public Aluno(Long id, String name, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +


                '}';
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

