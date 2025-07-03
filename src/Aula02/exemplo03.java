package Aula02;

import java.util.Scanner;

public class exemplo03 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe se você é emancipado? (s/n)");
        boolean emancipado = scanner.next().equalsIgnoreCase("s");

        // Utilizando elvis operator.
       var podeDirigir = (idade >= 18) || (idade >= 16 && emancipado);
       var message = podeDirigir ?
               nome + ", você pode dirigir. \n" :
               nome + ", você não pode dirigir. \n";

       System.out.println(message);
       System.out.println("Fim da execução!");

        scanner.close();
    }
}