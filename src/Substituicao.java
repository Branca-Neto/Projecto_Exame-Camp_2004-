public class Substituicao {
    private int id;
    private int partidaId;
    private int jogadorSaiId;
    private int jogadorEntraId;
    private int minuto;
    private Partidas partida;
    private Jogadores jogadorSai;
    private Jogadores jogadorEntra;

    // Construtor, getters e setters

    public Substituicao(int id, int partidaId, int jogadorSaiId, int jogadorEntraId, int minuto, Partidas partida, Jogadores jogadorSai, Jogadores jogadorEntra) {
        this.id = id;
        this.partidaId = partidaId;
        this.jogadorSaiId = jogadorSaiId;
        this.jogadorEntraId = jogadorEntraId;
        this.minuto = minuto;
        this.partida = partida;
        this.jogadorSai = jogadorSai;
        this.jogadorEntra = jogadorEntra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }

    public int getJogadorSaiId() {
        return jogadorSaiId;
    }

    public void setJogadorSaiId(int jogadorSaiId) {
        this.jogadorSaiId = jogadorSaiId;
    }

    public int getJogadorEntraId() {
        return jogadorEntraId;
    }

    public void setJogadorEntraId(int jogadorEntraId) {
        this.jogadorEntraId = jogadorEntraId;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Partidas getPartida() {
        return partida;
    }

    public void setPartida(Partidas partida) {
        this.partida = partida;
    }

    public Jogadores getJogadorSai() {
        return jogadorSai;
    }

    public void setJogadorSai(Jogadores jogadorSai) {
        this.jogadorSai = jogadorSai;
    }

    public Jogadores getJogadorEntra() {
        return jogadorEntra;
    }

    public void setJogadorEntra(Jogadores jogadorEntra) {
        this.jogadorEntra = jogadorEntra;
    }
}
