import config.Database;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Database db = new Database();
        db.getConnection();

        PaisDatabase paisDatabase = new PaisDatabase(db);
        List<Pais> paises  = paisDatabase.obterTodos();
        for (Pais pais : paises){
            System.out.println("Pais: "+pais.getNome());
        }
    }
}
