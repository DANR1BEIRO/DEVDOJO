package academy.devdojo.maratonajava.javacore.ZZJ_CRUD.repository;

import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZJ_CRUD.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}'", name);
        String sql = "SELECT * FROM anime_store.anime where name like ?;";
        List<Anime> animes = new ArrayList<>();

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPreparedStatementFindByName(conn, name);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .name(rs.getString("producer_name"))
                        .id(rs.getInt("producer_id"))
                        .build();
                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find animes by name", e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join anime_store.producer p on a.producer_id = p.id where a.name like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Anime by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {

            if (!rs.next()) return Optional.empty();

            Producer producer = Producer.builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();
            Anime anime = Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find anime by id", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join anime_store.producer p on a.producer_id = p.id where a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted Anime '{}' from database.", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete Anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime Anime) {
        log.info("Saving Anime '{}'", Anime);
        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepareStatementSave(conn, Anime)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to update Anime '{}'", Anime.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Anime Anime) throws SQLException {
        String sql = """
                INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Anime.getName());
        ps.setInt(2, Anime.getEpisodes());
        ps.setInt(3, Anime.getProducer().getId());

        return ps;
    }

    public static void update(Anime Anime) {
        log.info("Updating Anime '{}'", Anime);
        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement ps = createPrepareStatementUpdate(conn, Anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update Anime '{}'", Anime.getId(), e);
        }
    }

    private static PreparedStatement createPrepareStatementUpdate(Connection conn, Anime Anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Anime.getName());
        ps.setInt(2, Anime.getEpisodes());
        ps.setInt(3, Anime.getId());
        return ps;
    }

    private static Anime createAnime(ResultSet rs) throws SQLException {
        Producer producer = Producer.builder()
                .name(rs.getString("producer_name"))
                .id(rs.getInt("producer_id"))
                .build();
        return Anime.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .episodes(rs.getInt("episodes"))
                .producer(producer)
                .build();
    }
}
