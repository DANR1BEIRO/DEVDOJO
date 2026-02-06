package academy.devdojo.maratonajava.javacore.ZZI_JDBC.test;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD2").build();
        ProducerServiceRowSet.updateJbcRowSet(producerToUpdate);
        //log.info("--------------------------- ");
        //List<Producer> producers = ProducerServiceRowSet.findByNameJbcsRowSet("");
        //log.info(producers);
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
    }
}
