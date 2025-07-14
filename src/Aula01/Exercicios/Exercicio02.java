package Aula01.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado (em centímetros): ");
        float lado = scanner.nextFloat();

        float area = lado * lado;

        System.out.printf("A área do quadrado é de %.2f cm².", area);

        scanner.close();
    }
}