package geenAI_Simulator.service;

import geenAI_Simulator.model.Prompt;
import geenAI_Simulator.model.Resposta;

public interface IAService {
    Resposta processarPrompt(Prompt prompt);
    }


