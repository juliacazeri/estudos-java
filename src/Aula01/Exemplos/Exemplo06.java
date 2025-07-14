package Aula01.Exemplos;

import java.util.Scanner;

public class Exemplo06 {

    public static void main (String args[]){
        // Operadores de atribuição e lógicos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = scanner.nextInt();
        System.out.println("Você é emancipado?");
        boolean emancipado = scanner.nextBoolean();
        boolean podeDirigir = idade >= 18 || (emancipado && idade >= 16); // Verifica se a idade é maior que 17.
        System.out.printf("Você pode dirigir? (%s)", podeDirigir);

    }
}