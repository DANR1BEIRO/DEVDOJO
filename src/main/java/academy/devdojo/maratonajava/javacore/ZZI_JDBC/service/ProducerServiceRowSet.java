package academy.devdojo.maratonajava.javacore.ZZI_JDBC.service;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {

    public static List<Producer> findByNameJbcsRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJbcsRowSet(name);
    }
}
