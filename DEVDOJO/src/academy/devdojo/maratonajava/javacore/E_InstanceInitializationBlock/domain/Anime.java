package academy.devdojo.maratonajava.javacore.E_InstanceInitializationBlock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    /**
     * 1 - Alocado espaco em memória para o objeto
     * 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
     * 3 - Bloco de inicializacão é executado
     * 4 - Construtor é executado
     */
    {
        System.out.println("Dentro do bloco 1 de inicializacão de instância");
        episodes = new int[100];
        for (int i = 0; i < episodes.length ; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : this.episodes) {
                System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

}
