package Aula11.Exercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio10{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Integer, List<Integer>> agrupados = new HashMap<>();

        List<Integer> multiplosDeTres = numeros.stream()
                .filter(n -> n % 2 != 0 && n % 3 == 0)
                .collect(Collectors.toList());

        List<Integer> multiplosDeCinco = numeros.stream()
                .filter(n -> n % 2 != 0 && n % 5 == 0)
                .collect(Collectors.toList());

        agrupados.put(3, multiplosDeTres);
        agrupados.put(5, multiplosDeCinco);

        System.out.println("Impares multiplos de 3 e 5 agrupados: " + agrupados + ".");
    }
}