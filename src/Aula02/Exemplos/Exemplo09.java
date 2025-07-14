package Aula02.Exemplos;

import java.util.Scanner;

public class Exemplo09 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        while(true){
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println(nome);

            if(nome.equalsIgnoreCase("exit")) break;
        }
        scanner.close();
    }
}