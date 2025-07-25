package Aula10.Exercicios.Exercicio08;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras{
    private Map<String, Palavra> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int contagem){
        if(contagemPalavrasMap.containsKey(palavra)){
            contagemPalavrasMap.get(palavra).incrementar();
        } else{
            contagemPalavrasMap.put(palavra, new Palavra(palavra, contagem));
        }
    }

    public void removerPalavra(String palavra){
        if(contagemPalavrasMap.containsKey(palavra)){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        if(contagemPalavrasMap.isEmpty()){
            System.out.println("Nenhuma palavra registrada.");
        } else{
            for(Map.Entry<String, Palavra> entry : contagemPalavrasMap.entrySet()){
                System.out.println("Palavra: " + entry.getKey() + ", Contagem: " + entry.getValue().getContagem() + ".");
            }
        }
    }

    public Palavra encontrarPalavraMaisFrequente(){
        Palavra maisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;

        for(Palavra p : contagemPalavrasMap.values()){
            if(p.getContagem() > maiorContagem){
                maiorContagem = p.getContagem();
                maisFrequente = p;
            }
        }
        return maisFrequente;
    }

    public static void main(String[] args){
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.exibirContagemPalavras();

        contagem.adicionarPalavra("java", 1);
        contagem.adicionarPalavra("map", 1);
        contagem.adicionarPalavra("java", 1);
        contagem.adicionarPalavra("estrutura", 1);
        contagem.adicionarPalavra("java", 1);
        contagem.adicionarPalavra("map", 1);

        System.out.println("\nContagem atual das palavras: ");
        contagem.exibirContagemPalavras();

        Palavra maisFrequente = contagem.encontrarPalavraMaisFrequente();
        System.out.println("\nPalavra mais frequente: " + maisFrequente + ".");

        contagem.removerPalavra("estrutura");
        System.out.println("\nApós remover a palavra 'estrutura': ");
        contagem.exibirContagemPalavras();
    }
}