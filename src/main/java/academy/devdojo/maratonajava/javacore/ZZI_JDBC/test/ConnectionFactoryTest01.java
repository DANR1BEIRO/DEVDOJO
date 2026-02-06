package academy.devdojo.maratonajava.javacore.ZZI_JDBC.test;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("madhouse").build();

        //ProducerService.save(producer);
        //ProducerService.delete(12);
        //ProducerService.update(producerToUpdate);
        //List<Producer> producerList = ProducerService.findAll();
        //List<Producer> findProducersByName = ProducerService.findByName("d");
        //log.info("Producers found '{}'", findProducersByName);
        //ProducerService.displayProducerMetaData();
        //ProducerService.displayDriverMetaData();
        //ProducerService.displayTypeScrollWorking();
        //List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        //List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 Pictures");
        //ProducerService.findByNameAndDelete("A-1 Pictures");
        //List<Producer> producers = ProducerService.findBynamePreparedStatement("o");
        //ProducerService.updatePreparedStatement(producerToUpdate);
        //log.info("Producers found '{}'", producers);

        List<Producer> producers = ProducerService.findBynameCallableStatement("nhk");
        log.info("Producers found '{}'", producers);


    }
}