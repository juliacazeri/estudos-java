package Aula06.Exercicios.Exercicio02;

import java.util.Scanner;

public class CarroApp{
    private final static Scanner scanner = new Scanner(System.in);
    private static Carro carro = new Carro();

    public static void main (String[] args){
        int opcao;

        do{
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1 - Ligar o carro.");
            System.out.println("2 - Desligar o carro.");
            System.out.println("3 - Acelerar.");
            System.out.println("4 - Diminuir velocidade.");
            System.out.println("5 - Trocar marcha.");
            System.out.println("6 - Verificar velocidade.");
            System.out.println("7 - Virar. (esquerda/direita)");
            System.out.println("8 - Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    trocarDeMarcha();
                    break;
                case 6:
                    carro.verificarVelocidade();
                    break;
                case 7:
                    virarNaDirecao();
                    break;
                case 8:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(true);
    }

    private static void trocarDeMarcha(){
        System.out.println("Insira a nova marcha para trocar. De 0 à 6: ");
        int novaMarcha =scanner.nextInt();
        scanner.nextLine();
        carro.trocarMarcha(novaMarcha);
    }

    private static void virarNaDirecao(){
        System.out.println("Insira a direção que deseja virar. Direita ou esquerda.");
        String direcao = scanner.nextLine();
        carro.virar(direcao);
    }
}