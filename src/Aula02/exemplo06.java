package Aula02;

import java.util.Scanner;

public class exemplo06 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        for(;;){
            System.out.println("Insira seu nome:");
            String nome = scanner.nextLine();

            // Encerra o código
            if(nome.equalsIgnoreCase("exit")) break;

            System.out.println(nome);
        }
        scanner.close();
    }
}