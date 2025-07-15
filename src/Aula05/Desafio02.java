package Aula05;

import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Insira seu ID: ");
        int id = scanner.nextInt();

        String nomeFormatado = nome.toLowerCase().replace(" ","");

        String identificador = nomeFormatado + "-" + id;

        System.out.println(identificador);

        scanner.close();
    }
}