package Aula01.Exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int anoBase = 2025;

        System.out.println("Olá, insira o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Agora seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoBase - anoNascimento;

        System.out.printf("Olá %s, sua idade é %d anos.", nomeCompleto, idade);

        scanner.close();
    }
}