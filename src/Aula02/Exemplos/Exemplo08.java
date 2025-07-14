package Aula02.Exemplos;

import java.util.Scanner;

public class Exemplo08 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        while(!nome.equalsIgnoreCase("exit")){
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
        }
        scanner.close();
    }
}