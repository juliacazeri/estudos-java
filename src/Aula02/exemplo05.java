package Aula02;

import java.util.Scanner;

public class exemplo05 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 até 7: ");
        int opção = scanner.nextInt();

        switch (opção){
           case 1 -> System.out.println("Domingo");
           case 2 -> System.out.println("Segunda");
           case 3 -> System.out.println("Terça");
           case 4 -> System.out.println("Quarta");
           case 5 -> System.out.println("Quinta");
           case 6 -> System.out.println("Sexta");
           case 7 -> System.out.println("Sábado");
           default -> System.out.println("Opção inválida!");
        }
        scanner.close();
    }
}