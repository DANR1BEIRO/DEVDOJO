package academy.devdojo.maratonajava.javacore.N_Polymorphism.test_Controller;

import academy.devdojo.maratonajava.javacore.N_Polymorphism.repository.Repository;
import academy.devdojo.maratonajava.javacore.N_Polymorphism.service_View.RepositoryDataBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDataBase();
        repository.save();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");

        System.out.println(list);
    }
}
