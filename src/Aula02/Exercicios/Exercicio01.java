package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número de 1 à 10 para obter sua tabuada: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
        scanner.close();
    }
}