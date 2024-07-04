public class Pais {
    private int Id;
    private String nome;

    public Pais() {}
    public Pais(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
