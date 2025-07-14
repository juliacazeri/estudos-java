package Aula01.Exemplos;

import java.util.Scanner;

public class Exemplo07 {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s ", numero1, Math.sqrt(numero1));
    }
}