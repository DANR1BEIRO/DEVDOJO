package academy.devdojo.maratonajava.javacore.ZZJ_CRUD.repository;

import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByname(String name) {
        log.info("Finding producer by name '{}'", name);
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers = new ArrayList<>();

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPreparedStatementFindByname(conn, name);
                ResultSet rs = ps.executeQuery()) {

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

    private static PreparedStatement createPreparedStatementFindByname(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producer by id '{}'", id);
        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPreparedStatementFindById(conn, id);
                ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            return Optional.of(Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        } catch (
                SQLException e) {
            log.error("Error while trying to find producers by name", e);
        }
        return Optional.empty();
    }


    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}' from database.", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving producer '{}'", producer);
        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepareStatementSave(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws
            SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'", producer);
        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepareStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
