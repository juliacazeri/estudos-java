package Aula01;

import java.util.Scanner;

public class exercicio03 {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo (em centímetros):");
        float base = scanner.nextFloat();

        System.out.println("Informe a altura do retângulo (em centímetros):");
        float altura = scanner.nextFloat();

        float area = base * altura;

        System.out.printf("A área do retângulo é de %.2f cm².", area);

        scanner.close();
    }
}