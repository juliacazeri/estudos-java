package Aula08.Exercicios.Exercicio03;

import java.util.Scanner;

public class AreaApp{
    private final static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Calculo Figura Geométrica =====");
            System.out.println("1- Calcular área do quadrado.");
            System.out.println("2- Calcular área do retângulo.");
            System.out.println("3- Calcular área do círculo.");
            System.out.println("4- Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    calcularAreaQuadrado();
                    break;
                case 2:
                    calcularAreaRetangulo();
                    break;
                case 3:
                    calcularAreaCirculo();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(true);
    }

    private static void calcularAreaQuadrado(){
        System.out.println("Informe o lado do quadrado. (Em centimetros): ");
        double lado = scanner.nextDouble();
        scanner.nextLine();

        Quadrado quadrado = new Quadrado(lado);
        System.out.println("A área do quadrado é " + quadrado.calcularArea() + " centimetros.");
    }

    private static void calcularAreaRetangulo(){
        System.out.println("Informe a base do retângulo. (Em centimetros): ");
        double base = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe a altura do retângulo. (Em centimetros): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        Retangulo retangulo = new Retangulo(base, altura);
        System.out.println("A área do retângulo é " + retangulo.calcularArea() + " centimetros.");
    }

    private static void calcularAreaCirculo(){
        System.out.println("Informe o raio do círculo. (Em centimetros): ");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        Circulo circulo = new Circulo(raio);
        System.out.println("A área do circulo é " + circulo.calcularArea() + " centimetros.");
    }
}