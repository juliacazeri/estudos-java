package Aula01.Exemplos;

import java.util.Scanner;

public class Exemplo05 {

    public static void main (String args[]){
        // Operadores de atribuição e lógicos

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        int resultado = scanner.nextInt();
        boolean estaErrado = resultado != 4; // != se for diferente de 4.
        System.out.printf("O resultado é 4, você acertou? (%s)", !estaErrado);
    }
}
