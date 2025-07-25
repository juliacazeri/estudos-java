package Aula10.Exercicios.Exercicio09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline{
    private Map<String, Livro> livrosMap;

    public LivrariaOnline(){
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        Livro livro = new Livro(titulo, autor, preco);
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo){
        String linkParaRemover = null;
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                linkParaRemover = entry.getKey();
                break;
            }
        }
        if(linkParaRemover != null){
            livrosMap.remove(linkParaRemover);
            System.out.println("Livro removido com sucesso.");
        } else{
            System.out.println("Livro não encontrado.");
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Livro> livros = new ArrayList<>(livrosMap.values());
        livros.sort(Comparator.comparingDouble(Livro::getPreco));
        for(Livro livro : livros){
            System.out.println(livro);
        }
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> encontrados = new ArrayList<>();
        for(Livro livro : livrosMap.values()){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                encontrados.add(livro);
            }
        }
        return encontrados;
    }

    public Livro obterLivroMaisCaro(){
        return livrosMap.values().stream()
                .max(Comparator.comparingDouble(Livro::getPreco))
                .orElse(null);
    }

    public Livro exibirLivroMaisBarato(){
        return livrosMap.values().stream()
                .min(Comparator.comparingDouble(Livro::getPreco))
                .orElse(null);
    }

    public static void main (String[] args){
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("https://amazon.com/livro1", "Harry Potter e a Pedra Filosofal", "J.K Rowling", 49.90);
        livraria.adicionarLivro("https://amazon.com/livro2", "A Seleção", "Kiera Cass", 59.99);
        livraria.adicionarLivro("https://amazon.com/livro3", "Harry Potter e o Calice de Fogo", "J.K Rowling", 39.90);
        livraria.adicionarLivro("https://amazon.com/livro4", "A rainha Vermelha", "Victoria Aveyard", 29.99);

        System.out.println("\nLivros ordenados por preço:");
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nLivros do autor J.K Rowling:");
        List<Livro> livrosAutor = livraria.pesquisarLivrosPorAutor("J.K Rowling");
        for(Livro livro : livrosAutor){
            System.out.println(livro);
        }

        System.out.println("\nLivro mais caro:");
        System.out.println(livraria.obterLivroMaisCaro());

        System.out.println("\nLivro mais barato:");
        System.out.println(livraria.exibirLivroMaisBarato());

        System.out.println("\nRemovendo livro 'Harry Potter e o Calice de Fogo'...");
        livraria.removerLivro("Harry Potter e o Calice de Fogo");

        System.out.println("\nLivros atualizados:");
        livraria.exibirLivrosOrdenadosPorPreco();
    }
}