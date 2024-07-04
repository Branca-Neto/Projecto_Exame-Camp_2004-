import java.util.List;

public class Grupos {
    private int id;
    private String nome;
    private List<SelecaoGrupo> selecaoGrupos;
    private List<Partidas> partidas;

    // Construtor, getters e setters

    public Grupos(int id, String nome, List<SelecaoGrupo> selecaoGrupos, List<Partidas> partidas) {
        this.id = id;
        this.nome = nome;
        this.selecaoGrupos = selecaoGrupos;
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

    public List<SelecaoGrupo> getSelecaoGrupos() {
        return selecaoGrupos;
    }

    public void setSelecaoGrupos(List<SelecaoGrupo> selecaoGrupos) {
        this.selecaoGrupos = selecaoGrupos;
    }

    public List<Partidas> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partidas> partidas) {
        this.partidas = partidas;
    }
}
