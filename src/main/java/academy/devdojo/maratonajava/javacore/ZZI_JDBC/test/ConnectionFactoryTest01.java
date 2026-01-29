package academy.devdojo.maratonajava.javacore.ZZI_JDBC.test;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer nhk = Producer.ProducerBuilder.builder()
                .name("NHK")
                .build();

        ProducerRepository.save(nhk);
    }
}
