package Aula11.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio18{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("Todos os números são iguais?" + todosIguais + ".");
    }
}