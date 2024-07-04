import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PartidaRepository {

    public List<Partida> getAllPartidas() throws SQLException {
        List<Partida> partidas = new ArrayList<>();
        String sql = "SELECT * FROM partidas";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                int golsSelecao1 = rs.getInt("gols_selecao1");
                int golsSelecao2 = rs.getInt("gols_selecao2");
                int selecaoCasaId = rs.getInt("selecao_casa_id");
                Partida partida = new Partida(id, golsSelecao1, golsSelecao2, selecaoCasaId, selecaoCasaId, null, null);
                partidas.add(partida);
            }
        }

        return partidas;
    }

    // Adicione outros métodos conforme necessário, como para obter partidas específicas
}
