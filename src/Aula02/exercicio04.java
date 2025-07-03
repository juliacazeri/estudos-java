package Aula02;

import java.util.Scanner;

public class exercicio04 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        while(true){
            System.out.println("Informe o número para verificação: ");
            int verifica = scanner.nextInt();

            if(verifica < numero){
                System.out.printf("Informe um número maior que %s.\n", numero);
                continue;
            }
            int resultado = verifica % numero;
            System.out.printf(" %s %% %s = %s\n", verifica, numero,resultado);
            if(resultado != 0) break;
        }
        scanner.close();
    }
}