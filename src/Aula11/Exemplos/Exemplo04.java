package Aula11.Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.

public class Exemplo04{

    public static void main (String[] args){
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres.
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usa o Stream para filtrar as palavras com mais de 5 caracteres e imprimir cada palavra que passou no filtro.
        palavras.stream()
                .filter(p ->  p.length() > 5)
                .forEach(System.out::println);
    }
}