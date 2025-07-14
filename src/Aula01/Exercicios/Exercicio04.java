package Aula01.Exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, insira o seu nome: ");
        String nome1 = scanner.nextLine();
        System.out.println("Agora insira a sua idade: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Agora insira o nome do(a) seu/sua amigo(a): ");
        String nome2 = scanner.nextLine();
        System.out.println("E insira a idade dele(a) também: ");
        int idade2 = scanner.nextInt();

        int diferencaIdade = idade1 - idade2;

        System.out.printf("%s e %s tem %d ano(s) de diferença.",nome1, nome2, diferencaIdade);

        scanner.close();
    }
}