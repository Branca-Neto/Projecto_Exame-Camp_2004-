public class Eventos {
    private int id;
    private String tipo;
    private int jogadorId;
    private int minuto;
    private int partidaId;

    // Construtor, getters e setters

    public Eventos(int id, String tipo, int jogadorId, int minuto, int partidaId) {
        this.id = id;
        this.tipo = tipo;
        this.jogadorId = jogadorId;
        this.minuto = minuto;
        this.partidaId = partidaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(int partidaId) {
        this.partidaId = partidaId;
    }
}
