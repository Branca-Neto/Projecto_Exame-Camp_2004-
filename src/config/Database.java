package config;
import java.sql.*;
import java.util.Scanner;

public class Database {
    private Connection connection;

    String url = "jdbc:postgresql://ep-tiny-union-a538wt4z.us-east-2.aws.neon.tech/euro_campeonato?user=euro_campeonato_owner&password=f1hYci5RVQDW&sslmode=require";

    public Database() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url);
            System.out.println("Conexao feita com sucesso.");
        } catch (SQLException | ClassNotFoundException e) {
            throw new SQLException("Erro ao conectar ao banco de dados", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
