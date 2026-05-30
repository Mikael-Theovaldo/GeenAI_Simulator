package openAI_Simulator.service;

import openAI_Simulator.model.Prompt;
import openAI_Simulator.model.Resposta;

public interface IAService {
    Resposta processarPrompt(Prompt prompt);
    }


