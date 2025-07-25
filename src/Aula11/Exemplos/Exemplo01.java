package Aula11.Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Consumer: Representa a operação que aceita um argumento do tipo T e nã retorna nenhum resultado.
// É usada para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar ou retornar um valor.

public class Exemplo01{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usa o Consumer com expressão Lambda para imprimir números pares.
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // Usa o Consumer para imprimir números pares no Stream.
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}