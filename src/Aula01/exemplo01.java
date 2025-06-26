package Aula01;

import java.util.Scanner;

public class exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, informe o seu nome: ");
        String name = scanner.next();
        System.out.println("Agora informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, idade);
    }
}