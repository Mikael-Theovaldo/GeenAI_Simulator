package geenAI_Simulator.model;

public class Usuario {
    private String id;
    private String nome;
    int quantidadePrompts;


    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePrompts() {
        return quantidadePrompts;
    }

    public void setQuantidadePrompts(int quantidadePrompts) {
        this.quantidadePrompts = quantidadePrompts;
    }
}
