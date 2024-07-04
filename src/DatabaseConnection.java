import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class  DatabaseConnection{
    private static final String URL = "jdbc:postgresql://ep-tiny-union-a538wt4z.us-east-2.aws.neon.tech/euro_campeonato?user=euro_campeonato_owner&password=f1hYci5RVQDW&sslmode=require";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
