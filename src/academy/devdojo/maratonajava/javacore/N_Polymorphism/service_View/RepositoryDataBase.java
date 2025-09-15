package academy.devdojo.maratonajava.javacore.N_Polymorphism.service_View;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.repository.Repository;

public class RepositoryDataBase implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in a data base");
    }
}
