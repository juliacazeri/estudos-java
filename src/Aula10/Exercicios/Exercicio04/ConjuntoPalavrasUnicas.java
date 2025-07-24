package Aula10.Exercicios.Exercicio04;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas{
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas(){
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String texto){
        palavraSet.add(new Palavra(texto));
    }

    public void removerPalavra(String texto){
        Palavra palavraParaRemover = null;
        for(Palavra p : palavraSet){
            if(p.getTexto().equalsIgnoreCase(texto.trim())){
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String texto){
        for(Palavra p : palavraSet){
            if(p.getTexto().equalsIgnoreCase(texto.trim())){
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas(){
        System.out.println("Palavras únicas no conjunto:");
        System.out.println(palavraSet);
    }

    public int contarPalavras(){
        return palavraSet.size();
    }

    public static void main (String[] args){
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        System.out.println("Existem " + conjunto.contarPalavras() + " palavras no conjunto.");

        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("java");
        conjunto.adicionarPalavra("Kotlin");

        System.out.println("Existem " + conjunto.contarPalavras() + " palavras no conjunto.");

        conjunto.removerPalavra("python");

        System.out.println("A palavra 'kotlin' está no conjunto? " + conjunto.verificarPalavra("Kotlin"));
        System.out.println("A palavra 'python' está no conjunto? " + conjunto.verificarPalavra("Python"));

        conjunto.exibirPalavrasUnicas();
    }
}