package Aula05;

import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a URL para formatação: ");
        String url = scanner.nextLine();

        String urlFormatada = url.trim().toLowerCase();

        System.out.println(urlFormatada);

        scanner.close();
    }
}