package Aula02;

import java.util.Scanner;

public class exemplo10 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = "exit";

        do{
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println(nome);
        } while(!nome.equalsIgnoreCase("exit"));
        scanner.close();
    }
}