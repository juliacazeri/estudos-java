package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        int numero2;
        do{
            System.out.println("Insira o segundo número, maior que o primeiro: ");
            numero2 = scanner.nextInt();

            if(numero2 <= numero1) {
                System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente.");
            }
        } while(numero2 <= numero1);

        scanner.nextLine();

        String escolha;
        do{
            System.out.println("Escolha par ou impar: ");
            escolha = scanner.nextLine().toLowerCase();

            if(!escolha.equals("par") && !escolha.equals("impar")) {
                System.out.println("Opção inválida. Insira par ou impar.");
            }
        } while(!escolha.equals("par") && !escolha.equals("impar"));

        System.out.printf("Números %s entre %d e %d em ordem decrescente: ", escolha, numero1, numero2);

        for(int i = numero2; i >= numero1; i--){
            if(escolha.equals("par") && i % 2 == 0){
                System.out.print(i + " ");
            } else if(escolha.equals("impar") && i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}