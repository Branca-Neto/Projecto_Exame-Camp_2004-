import java.sql.SQLException;
import java.util.List;

public class CampeonatoService {
    private GrupoRepository grupoRepository;
    private SelecaoRepository selecaoRepository;
    private PartidaRepository partidaRepository;

    public CampeonatoService() {
        this.grupoRepository = new GrupoRepository();
        this.selecaoRepository = new SelecaoRepository();
        this.partidaRepository = new PartidaRepository();
    }

    public void listarGrupos() throws SQLException {
        List<Grupo> grupos = grupoRepository.getAllGrupos();
        for (Grupo grupo : grupos) {
            System.out.println("Grupo: " + grupo.getNome());
            // Listar seleções do grupo
        }
    }

    public void listarSelecoes() throws SQLException {
        List<Selecao> selecoes = selecaoRepository.getAllSelecoes();
        for (Selecao selecao : selecoes) {
            System.out.println("Seleção: " + selecao.getNome());
        }
    }

    public void listarPartidas() throws SQLException {
        List<Partida> partidas = partidaRepository.getAllPartidas();
        for (Partida partida : partidas) {
            System.out.println("Partida: " + partida.getId() + " - " + partida.getGolsSelecao1() + " x " + partida.getGolsSelecao2());
        }
    }

    // Implementar outras funcionalidades conforme necessário
}
