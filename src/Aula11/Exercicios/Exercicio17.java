package Aula11.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio17{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                .filter(Exercicio17 ::EPrimo)
                .collect(Collectors.toList());

        System.out.println("Os números primos da lista são: " + primos + ".");
    }

    private static boolean EPrimo(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if(n % i == 0) return false;
        }
        return true;
    }
}