package Aula02;

import java.util.Scanner;

public class exemplo01 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.printf("%s, você tem %d anos, você pode dirigir.\n", nome, idade);
        } else{
            System.out.printf("%s, você não pode dirigir!\n", nome);
        }
        System.out.println("Fim da execução!");

        scanner.close();
    }
}