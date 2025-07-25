package Aula11.Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

// BinaryOperator: Representa uma operação que combina dois argumentos T e retorna um resultado do mesmo tipo T.
// É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.

public class Exemplo05{

    public static void main (String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usa o BinaryOperator com expressão lambda para somar dois números inteiros.
        BinaryOperator<Integer> somar = Integer::sum;

        // Usa o BinaryOperator para somar todos os números no Stream.
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma.
        System.out.println("A soma dos números é de: " + resultado);
    }
}