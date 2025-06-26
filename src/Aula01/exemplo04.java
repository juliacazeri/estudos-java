package Aula01;

import java.util.Scanner;

public class exemplo04 {

    public static void main (String args[]){
        // Operadores de atribuição e lógicos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        int resultado = scanner.nextInt();
        boolean estaCorreto = resultado == 4; // == se for igual a 4.
        System.out.printf("O resultado é 4, você acertou? (%s)", estaCorreto);
    }
}
