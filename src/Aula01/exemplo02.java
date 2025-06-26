package Aula01;

import java.util.Scanner;

public class exemplo02 {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        var name = scanner.next();
        System.out.println("Agora informe sua idade: ");
        var idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s. \n", name, idade);
    }
}