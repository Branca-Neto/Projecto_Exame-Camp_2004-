import java.util.List;

public class Paises {
    private int id;
    private String nome;
    private List<Cidades> cidades;
    private List<Selecoes> selecoes;

    // Construtor, getters e setters

    public Paises(int id, String nome, List<Cidades> cidades, List<Selecoes> selecoes) {
        this.id = id;
        this.nome = nome;
        this.cidades = cidades;
        this.selecoes = selecoes;
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

    public List<Cidades> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidades> cidades) {
        this.cidades = cidades;
    }

    public List<Selecoes> getSelecoes() {
        return selecoes;
    }

    public void setSelecoes(List<Selecoes> selecoes) {
        this.selecoes = selecoes;
    }
}
