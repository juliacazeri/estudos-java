package Aula02.Exemplos;

import java.util.Scanner;

public class Exemplo02 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe se você é emancipado? (s/n)");
        // Se digitar "s" minusculo ou maisculo retorna verdadeiro, se não retorna falso.
        boolean emancipado = scanner.next().equalsIgnoreCase("s");

        if (idade >= 18){
            System.out.printf("%s, você tem %d anos, você pode dirigir.\n", nome, idade);
        } else if (idade >= 16 && emancipado){
            System.out.printf("%s, apesar de você ter %d anos você é emancipado e pode dirigir.\n", nome, idade);
        } else{
            System.out.printf("%s, você não pode dirigir!\n", nome);
        }
        System.out.println("Fim da execução!");

        scanner.close();
    }
}