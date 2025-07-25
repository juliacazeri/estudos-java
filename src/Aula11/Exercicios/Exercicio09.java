package Aula11.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio09{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean totalDistintos = numeros.size() == numeros.stream()
                .distinct()
                .count();

        System.out.println("Todos os números são distintos? " + totalDistintos + ".");
    }
}