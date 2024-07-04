public class EstatisticasIndividuais {
    private int id;
    private int partidaId;
    private int jogadorId;
    private int passes;
    private int assistencias;
    private int remates;
    private int minutosJogados;

    // Construtor, getters e setters

    public EstatisticasIndividuais(int id, int partidaId, int jogadorId, int passes, int assistencias, int remates, int minutosJogados) {
        this.id = id;
        this.partidaId = partidaId;
        this.jogadorId = jogadorId;
        this.passes = passes;
        this.assistencias = assistencias;
        this.remates = remates;
        this.minutosJogados = minutosJogados;
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

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public int getRemates() {
        return remates;
    }

    public void setRemates(int remates) {
        this.remates = remates;
    }

    public int getMinutosJogados() {
        return minutosJogados;
    }

    public void setMinutosJogados(int minutosJogados) {
        this.minutosJogados = minutosJogados;
    }
}
