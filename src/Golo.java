public class Golo {
    private int id;
    private int partidaId;
    private int jogadorId;
    private int minuto;

    // Construtor, getters e setters

    public Golo(int id, int partidaId, int jogadorId, int minuto) {
        this.id = id;
        this.partidaId = partidaId;
        this.jogadorId = jogadorId;
        this.minuto = minuto;
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

    public int getJogadorId() {
        return jogadorId;
    }

    public void setJogadorId(int jogadorId) {
        this.jogadorId = jogadorId;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
