package openAI_Simulator.model;

import java.util.ArrayList;
import java.util.List;

public class Conversa {
    private Usuario usuario;
    private List<Prompt> listaDePrompts = new ArrayList<>();
    private List<Resposta> listaDeRespostas = new ArrayList<>();

    public Conversa(Usuario usuario, List<Prompt> listaDePrompts, List<Resposta> listaDeRespostas) {
        this.usuario = usuario;
        this.listaDePrompts = listaDePrompts;
        this.listaDeRespostas = listaDeRespostas;

    }

    public void adicionarPrompt(Prompt prompt) {
        listaDePrompts.add(prompt);
    }

    public void adicionarResposta(Resposta resposta) {
        listaDeRespostas.add(resposta);
    }

    public void mostarHistorico() {
        System.out.println("Histórico da Conversa:");
        for (int i = 0; i < listaDePrompts.size(); i++) {
            System.out.println("Prompt: " + listaDePrompts.get(i).getTexto());
            if (i < listaDeRespostas.size()) {
                System.out.println("Resposta: " + listaDeRespostas.get(i).getConteudo());
            }
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Prompt> getListaDePrompts() {
        return listaDePrompts;
    }


    public List<Resposta> getListaDeRespostas() {
        return listaDeRespostas;
    }


}
