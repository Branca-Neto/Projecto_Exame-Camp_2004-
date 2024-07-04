public class Partidas {
    private int id;
    private int golsSelecao1;
    private int golsSelecao2;
    private int estatisticasEquipe1Id;
    private int estatisticasEquipe2Id;
    private int selecaoCasaId;
    private EstatisticasGlobais estatisticasEquipe1;
    private EstatisticasGlobais estatisticasEquipe2;

    // Construtor, getters e setters

    public Partidas(int id, int golsSelecao1, int golsSelecao2, int estatisticasEquipe1Id, int estatisticasEquipe2Id, int selecaoCasaId, EstatisticasGlobais estatisticasEquipe1, EstatisticasGlobais estatisticasEquipe2) {
        this.id = id;
        this.golsSelecao1 = golsSelecao1;
        this.golsSelecao2 = golsSelecao2;
        this.estatisticasEquipe1Id = estatisticasEquipe1Id;
        this.estatisticasEquipe2Id = estatisticasEquipe2Id;
        this.selecaoCasaId = selecaoCasaId;
        this.estatisticasEquipe1 = estatisticasEquipe1;
        this.estatisticasEquipe2 = estatisticasEquipe2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGolsSelecao1() {
        return golsSelecao1;
    }

    public void setGolsSelecao1(int golsSelecao1) {
        this.golsSelecao1 = golsSelecao1;
    }

    public int getGolsSelecao2() {
        return golsSelecao2;
    }

    public void setGolsSelecao2(int golsSelecao2) {
        this.golsSelecao2 = golsSelecao2;
    }

    public int getEstatisticasEquipe1Id() {
        return estatisticasEquipe1Id;
    }

    public void setEstatisticasEquipe1Id(int estatisticasEquipe1Id) {
        this.estatisticasEquipe1Id = estatisticasEquipe1Id;
    }

    public int getEstatisticasEquipe2Id() {
        return estatisticasEquipe2Id;
    }

    public void setEstatisticasEquipe2Id(int estatisticasEquipe2Id) {
        this.estatisticasEquipe2Id = estatisticasEquipe2Id;
    }

    public int getSelecaoCasaId() {
        return selecaoCasaId;
    }

    public void setSelecaoCasaId(int selecaoCasaId) {
        this.selecaoCasaId = selecaoCasaId;
    }

    public EstatisticasGlobais getEstatisticasEquipe1() {
        return estatisticasEquipe1;
    }

    public void setEstatisticasEquipe1(EstatisticasGlobais estatisticasEquipe1) {
        this.estatisticasEquipe1 = estatisticasEquipe1;
    }

    public EstatisticasGlobais getEstatisticasEquipe2() {
        return estatisticasEquipe2;
    }

    public void setEstatisticasEquipe2(EstatisticasGlobais estatisticasEquipe2) {
        this.estatisticasEquipe2 = estatisticasEquipe2;
    }
}
