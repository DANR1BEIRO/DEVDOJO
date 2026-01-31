package academy.devdojo.maratonajava.javacore.ZZI_JDBC.repository;

import academy.devdojo.maratonajava.javacore.ZZI_JDBC.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZI_JDBC.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = %d);"
                .formatted(producer.getName(), producer.getId());

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}'. Database rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        String sql = "SELECT id, name FROM anime_store.producer;";
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    public static List<Producer> findByname(String name) {
        log.info("Finding producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name", e);
        }
        return producers;
    }

    public static void displayProducerMetaData() {
        log.info("Displaying producer meta data:");
        String sql = "SELECT * FROM anime_store.producer";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();

            int columnCount = metaData.getColumnCount();
            log.info("Column count: '{}'", columnCount);

            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name: '{}'", metaData.getTableName(i));
                log.info("Column name: '{}'", metaData.getColumnName(i));
                log.info("Column size: '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type: '{}'", metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name", e);
        }
    }

    public static void displayDriverMetaData() {
        log.info("Displaying driver meta data:");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();

            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name", e);
        }
    }

    public static void displayTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("last row: '{}'", rs.last());
            log.info("row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("first row: '{}'", rs.first());
            log.info("row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("row absolute: '{}'", rs.absolute(2));
            log.info("row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("row relative: '{}'", rs.relative(-1));
            log.info("row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("is last: '{}'", rs.isLast());
            log.info("row number: '{}'", rs.getRow());

            log.info("is last: '{}'", rs.isFirst());
            log.info("row number: '{}'", rs.getRow());

            log.info("-----------------");
            rs.afterLast();
            log.info("is after last: '{}'", rs.isAfterLast());
            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error while trying to find producers by name", e);
        }
    }
}