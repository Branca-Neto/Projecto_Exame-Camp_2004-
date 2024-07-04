import java.util.List;

public class Estadios {
    private int id;
    private String nome;
    private int cidadeId;
    private int capacidade;
    private List<Partidas> partidas;

    // Construtor, getters e setters

    public Estadios(int id, String nome, int cidadeId, int capacidade, List<Partidas> partidas) {
        this.id = id;
        this.nome = nome;
        this.cidadeId = cidadeId;
        this.capacidade = capacidade;
        this.partidas = partidas;
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

    public int getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(int cidadeId) {
        this.cidadeId = cidadeId;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Partidas> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partidas> partidas) {
        this.partidas = partidas;
    }
}
