package academy.devdojo.maratonajava.javacore.ZZI_JDBC.repository;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2 // log library
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in database. Database rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = %d);".formatted(id);

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from database. Database rows affected '{}'", id, rowsAffected);


        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }
}
