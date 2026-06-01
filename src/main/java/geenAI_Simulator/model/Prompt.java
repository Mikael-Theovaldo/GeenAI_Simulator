package geenAI_Simulator.model;

import java.time.LocalDate;

public class Prompt {
    private String texto;
    private LocalDate dataHora;

    public Prompt(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }


    public LocalDate getDataHora() {
        return dataHora;
    }

}
