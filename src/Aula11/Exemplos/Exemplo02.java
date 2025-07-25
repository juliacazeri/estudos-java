package Aula11.Exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

// Supplier: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
// É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

public class Exemplo02{

    public static void main (String[] args){
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usa o Suplier para obter uma lista de 5 saudações.
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        // Imprimi as saudações geradas.
        listaSaudacoes.forEach(System.out::println);
    }
}