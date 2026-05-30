package openAI_Simulator.main;

import openAI_Simulator.model.Conversa;
import openAI_Simulator.model.Resposta;
import openAI_Simulator.model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GEN AI SIMULATOR ===");

        System.out.println("Olá, diga seu nome para iniciar a conversa...");
        Usuario usuario = new Usuario(scanner.nextLine());

        Conversa conversa = new Conversa(new Usuario(usuario.getNome()), null, null);

        System.out.println("Bem-vindo, " + usuario.getNome() + "! Você pode começar a conversar com a IA." +
                " Digite 'sair' para encerrar a conversa.");

         while (true) {
            System.out.print("Você: ");
            String prompt = scanner.nextLine();

            if (prompt.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando a conversa. Até mais!");
                break;
            }
            if(prompt.contains("java")){
                Resposta resposta =  new Resposta("IA: Java é uma linguagem de programação versátil" +
                        " e amplamente utilizada para desenvolvimento de aplicativos, sistemas e muito mais.");
                System.out.println("IA: " + resposta);
                continue;
            }

            Resposta resposta =  new Resposta("IA: Desculpe, não entendi sua pergunta. Por favor," +
                    " Se souber a resposta, por favor, compartilhe comigo.");




        }






















    }
}