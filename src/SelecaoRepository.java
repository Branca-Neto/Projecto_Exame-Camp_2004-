import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelecaoRepository {

    public List<Selecao> getAllSelecoes() throws SQLException {
        List<Selecao> selecoes = new ArrayList<>();
        String sql = "SELECT * FROM selecoes";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int paisId = rs.getInt("pais_id");
                Selecao selecao = new Selecao(id, nome, paisId, null, null, null, null, null);
                selecoes.add(selecao);
            }
        }

        return selecoes;
    }
    
    // Adicione outros métodos conforme necessário, como para obter seleções específicas
}
