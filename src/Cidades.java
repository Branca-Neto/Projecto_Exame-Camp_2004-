import java.util.List;

public class Cidades {
    private int id;
    private String nome;
    private int paisId;
    private List<Estadios> estadios;

    // Construtor, getters e setters

    public Cidades(int id, String nome, int paisId, List<Estadios> estadios) {
        this.id = id;
        this.nome = nome;
        this.paisId = paisId;
        this.estadios = estadios;
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

    public List<Estadios> getEstadios() {
        return estadios;
    }

    public void setEstadios(List<Estadios> estadios) {
        this.estadios = estadios;
    }
}
