import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GrupoRepository {

    public List<Grupo> getAllGrupos() throws SQLException {
        List<Grupo> grupos = new ArrayList<>();
        String sql = "SELECT * FROM grupos";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Grupo grupo = new Grupo(id, nome, new ArrayList<>(), new ArrayList<>());
                grupos.add(grupo);
            }
        }

        return grupos;
    }
    
    // Adicione outros métodos conforme necessário, como para obter grupos específicos
}
