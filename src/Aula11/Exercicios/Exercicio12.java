package Aula11.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio12{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> produto = numeros.stream()
                .reduce((a, b) -> a * b);

        if(produto.isPresent()){
            System.out.println("O produto de todos os números é: " + produto + ".");
        } else{
            System.out.println("A lista está vazia.");
        }
    }
}