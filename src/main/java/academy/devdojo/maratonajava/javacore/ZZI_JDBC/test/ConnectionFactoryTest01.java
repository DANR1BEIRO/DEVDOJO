package academy.devdojo.maratonajava.javacore.ZZI_JDBC.test;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();

        //ProducerService.save(producer);
        //ProducerService.delete(12);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producerList = ProducerService.findAll();
        //List<Producer> findProducersByName = ProducerService.findByName("d");
        //log.info("Producers found '{}'", findProducersByName);
        //ProducerService.displayProducerMetaData();
        ProducerService.displayDriverMetaData();
    }
}