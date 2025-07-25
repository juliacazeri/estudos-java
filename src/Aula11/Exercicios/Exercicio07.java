package Aula11.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio07{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();

        if(segundoMaior.isPresent()){
            System.out.println("Segundo maior número da lista: " + segundoMaior.get() + ".");
        } else{
            System.out.println("Não foi possível encontrar o segundo maior número.");
        }
    }
}