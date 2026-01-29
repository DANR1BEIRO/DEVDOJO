package academy.devdojo.maratonajava.javacore.ZZI_JDBC.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// java.sql = connection, statement, ResultSet, DiverManager
public class ConnectionFactory {

    // para montar uma conexão, precisamos desses dados:
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store"; // possibilita o DriverManager pegar uma conexão, porque todo db segue um padrao
        String username = "root";
        String password = "root";

            return DriverManager.getConnection(url, username, password);

    }
}
