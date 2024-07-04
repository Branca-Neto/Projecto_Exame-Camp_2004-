public class EstatisticasGlobais {
    private int id;
    private int partidaId;
    private int selecaoId;
    private int remates;
    private int livres;
    private int foras;
    private Partidas partidasEstatisticasEquipe1;
    private Partidas partidasEstatisticasEquipe2;

    // Construtor, getters e setters

    public EstatisticasGlobais(int id, int partidaId, int selecaoId, int remates, int livres, int foras, Partidas partidasEstatisticasEquipe1, Partidas partidasEstatisticasEquipe2) {
        this.id = id;
        this.partidaId = partidaId;
        this.selecaoId = selecaoId;
        this.remates = remates;
        this.livres = livres;
        this.foras = foras;
        this.partidasEstatisticasEquipe1 = partidasEstatisticasEquipe1;
        this.partidasEstatisticasEquipe2 = partidasEstatisticasEquipe2;
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

    public int getSelecaoId() {
        return selecaoId;
    }

    public void setSelecaoId(int selecaoId) {
        this.selecaoId = selecaoId;
    }

    public int getRemates() {
        return remates;
    }

    public void setRemates(int remates) {
        this.remates = remates;
    }

    public int getLivres() {
        return livres;
    }

    public void setLivres(int livres) {
        this.livres = livres;
    }

    public int getForas() {
        return foras;
    }

    public void setForas(int foras) {
        this.foras = foras;
    }

    public Partidas getPartidasEstatisticasEquipe1() {
        return partidasEstatisticasEquipe1;
    }

    public void setPartidasEstatisticasEquipe1(Partidas partidasEstatisticasEquipe1) {
        this.partidasEstatisticasEquipe1 = partidasEstatisticasEquipe1;
    }

    public Partidas getPartidasEstatisticasEquipe2() {
        return partidasEstatisticasEquipe2;
    }

    public void setPartidasEstatisticasEquipe2(Partidas partidasEstatisticasEquipe2) {
        this.partidasEstatisticasEquipe2 = partidasEstatisticasEquipe2;
    }
}
