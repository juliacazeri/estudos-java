package Aula10.Exercicios.Exercicio07;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
        System.out.println("Palavra adicionada: " + palavra + ".");
    }

    public void removerPalavra(String palavra) {
        if (palavras.containsKey(palavra)) {
            palavras.remove(palavra);
            System.out.println("Palavra removida: " + palavra + ".");
        } else {
            System.out.println("Palavra não encontrada: " + palavra + ".");
        }
    }

    public void exibirPalavras() {
        if (palavras.isEmpty()) {
            System.out.println("O dicionário está vazio.");
        } else {
            System.out.println("Palavras no dicionário: ");
            for (Map.Entry<String, String> entry : palavras.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = palavras.get(palavra);
        if (definicao != null) {
            return definicao;
        } else {
            return "Palavra não encontrada no dicionário.";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("Mapa", "Estrutura de dados que associa chaves a valores.");
        dicionario.adicionarPalavra("Classe", "Modelo ou molde para criar objetos.");

        System.out.println("\nDefinição de 'Java': " + dicionario.pesquisarPorPalavra("Java"));

        System.out.println("\nExibindo todas as palavras: ");
        dicionario.exibirPalavras();
    }
}