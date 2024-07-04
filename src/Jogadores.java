import java.util.List;

public class Jogadores {
    private int id;
    private String nome;
    private int idade;
    private String posicao;
    private int selecaoId;
    private List<Eventos> eventos;
    private List<Substituicao> substituicaoJogadorSai;
    private List<Substituicao> substituicaoJogadorEntra;
    private List<Golo> golos;
    private List<Cartao> cartoes;
    private List<EstatisticasIndividuais> estatisticasIndividuais;

    // Construtor, getters e setters

    public Jogadores(int id, String nome, int idade, String posicao, int selecaoId, List<Eventos> eventos, List<Substituicao> substituicoesSai, List<Substituicao> substituicoesEntra, List<Golo> golos, List<Cartao> cartoes, List<EstatisticasIndividuais> estatisticasIndividuais) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.selecaoId = selecaoId;
        this.eventos = eventos;
        this.substituicoesSai = substituicoesSai;
        this.substituicoesEntra = substituicoesEntra;
        this.golos = golos;
        this.cartoes = cartoes;
        this.estatisticasIndividuais = estatisticasIndividuais;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getSelecaoId() {
        return selecaoId;
    }

    public void setSelecaoId(int selecaoId) {
        this.selecaoId = selecaoId;
    }

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(List<Eventos> eventos) {
        this.eventos = eventos;
    }

    public List<Substituicao> getSubstituicoesSai() {
        return substituicoesSai;
    }

    public void setSubstituicoesSai(List<Substituicao> substituicoesSai) {
        this.substituicoesSai = substituicoesSai;
    }

    public List<Substituicao> getSubstituicoesEntra() {
        return substituicoesEntra;
    }

    public void setSubstituicoesEntra(List<Substituicao> substituicoesEntra) {
        this.substituicoesEntra = substituicoesEntra;
    }

    public List<Golo> getGolos() {
        return golos;
    }

    public void setGolos(List<Golo> golos) {
        this.golos = golos;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public List<EstatisticasIndividuais> getEstatisticasIndividuais() {
        return estatisticasIndividuais;
    }

    public void setEstatisticasIndividuais(List<EstatisticasIndividuais> estatisticasIndividuais) {
        this.estatisticasIndividuais = estatisticasIndividuais;
    }
}
