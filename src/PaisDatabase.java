import config.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PaisDatabase {
    private Database conn;

    public PaisDatabase(Database conn) {
        this.conn = conn;
    }
    public List<Pais> obterTodos() {
        String sql = "SELECT * FROM paises";
        try (Statement stmt = conn.getConnection().createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            List<Pais> paiss = new ArrayList<>();
            while (rs.next()) {
                Pais pais = new Pais();
                pais.setId(rs.getInt("id"));
                pais.setNome(rs.getString("nome"));
                paiss.add(pais);
            }
            return paiss;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pais obterPais(int id) {
        String sql = "SELECT * FROM paises WHERE id = ?";
        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(sql)) {
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Pais pais = new Pais();
                pais.setId(rs.getInt("id"));
                pais.setNome(rs.getString("nome"));
                return pais;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Pais obterPorId(int id) {
        Pais pais  = new Pais();
        String sql = "SELECT * FROM paises WHERE id = ?";
        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    pais.setId(rs.getInt("id"));
                    pais.setNome(rs.getString("nome"));
                } else {
                    return null;
                }
            }
            return pais;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int obterPorNome(String nome) {
        String sql = "SELECT id FROM paises WHERE nome = ?";
        try (PreparedStatement pstmt = conn.getConnection().prepareStatement(sql)) {
            pstmt.setString(1, nome);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");  // Pega o ID do resultado
                } else {
                    return -1;  // Indica que o nome não foi encontrado
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
