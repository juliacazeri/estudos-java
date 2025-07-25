package Aula11.Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio08{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaTotalDigitos = numeros.stream()
                .mapToInt(n -> {
                    int somaDigitos = 0;
                    int numero = n;
                    while(numero != 0){
                        somaDigitos += numero % 10;
                        numero /= 10;
                    }
                    return somaDigitos;
                })
                .sum();

        System.out.println("Soma dos dígitos é igual: " + somaTotalDigitos + ".");
    }
}