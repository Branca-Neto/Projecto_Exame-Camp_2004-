import java.util.List;

public class Selecoes {
    private int id;
    private String nome;
    private int paisId;
    private Paises pais;
    private List<Jogadores> jogadores;
    private List<Partidas> partidasSelecaoCasa;
    private List<Partidas> partidasSelecaoFora;
    private List<SelecaoGrupo> selecaoGrupos;
    private List<EstatisticasGlobais> estatisticasGlobaisEquipes;

    // Construtor, getters e setters

    public Selecoes(int id, String nome, int paisId, Paises pais, List<Jogadores> jogadores, List<Partidas> partidasSelecaoCasa, List<Partidas> partidasSelecaoFora, List<SelecaoGrupo> selecaoGrupos, List<EstatisticasGlobais> estatisticasGlobaisEquipes) {
        this.id = id;
        this.nome = nome;
        this.paisId = paisId;
        this.pais = pais;
        this.jogadores = jogadores;
        this.partidasSelecaoCasa = partidasSelecaoCasa;
        this.partidasSelecaoFora = partidasSelecaoFora;
        this.selecaoGrupos = selecaoGrupos;
        this.estatisticasGlobaisEquipes = estatisticasGlobaisEquipes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaisId() {
        return paisId;
    }

    public void setPaisId(int paisId) {
        this.paisId = paisId;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public List<Jogadores> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogadores> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Partidas> getPartidasSelecaoCasa() {
        return partidasSelecaoCasa;
    }

    public void setPartidasSelecaoCasa(List<Partidas> partidasSelecaoCasa) {
        this.partidasSelecaoCasa = partidasSelecaoCasa;
    }

    public List<Partidas> getPartidasSelecaoFora() {
        return partidasSelecaoFora;
    }

    public void setPartidasSelecaoFora(List<Partidas> partidasSelecaoFora) {
        this.partidasSelecaoFora = partidasSelecaoFora;
    }

    public List<SelecaoGrupo> getSelecaoGrupos() {
        return selecaoGrupos;
    }

    public void setSelecaoGrupos(List<SelecaoGrupo> selecaoGrupos) {
        this.selecaoGrupos = selecaoGrupos;
    }

    public List<EstatisticasGlobais> getEstatisticasGlobaisEquipes() {
        return estatisticasGlobaisEquipes;
    }

    public void setEstatisticasGlobaisEquipes(List<EstatisticasGlobais> estatisticasGlobaisEquipes) {
        this.estatisticasGlobaisEquipes = estatisticasGlobaisEquipes;
    }

}
