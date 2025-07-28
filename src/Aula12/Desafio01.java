package Aula12;

import java.util.Scanner;

public class Desafio01{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String linha = scanner.nextLine();
        scanner.close();

        String[] partes = linha.split(" ");

        System.out.println(partes[0]);
    }
}