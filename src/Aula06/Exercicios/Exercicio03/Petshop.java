package Aula06.Exercicios.Exercicio03;

import java.util.Scanner;

public class Petshop {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MaquinaBanho maquinaBanho = new MaquinaBanho();

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Escolha uma das opções: =====");
            System.out.println("1- Dar banho no animal.");
            System.out.println("2- Abastecer a máquina com água.");
            System.out.println("3- Abastecer a máquina com shampoo.");
            System.out.println("4- Verificar água da máquina.");
            System.out.println("5- Verificar shampoo da máquina.");
            System.out.println("6- Verificar se tem animal no banho.");
            System.out.println("7- Colocar animal na máquina.");
            System.out.println("8- Retirar o animal da máquina.");
            System.out.println("9- Limpar a máquina.");
            System.out.println("0- Sair.");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    maquinaBanho.darBanho();
                    break;
                case 2:
                    adicionarAgua();
                    break;
                case 3:
                    adicionarShampoo();
                    break;
                case 4:
                    verificaAgua();
                    break;
                case 5:
                    verificaShampoo();
                    break;
                case 6:
                    verificaSeTemAnimalNaMaquina();
                    break;
                case 7:
                    colocarAnimalNaMaquina();
                    break;
                case 8:
                    maquinaBanho.tirarAnimal();
                    break;
                case 9:
                    maquinaBanho.limparMaquina();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(true);
    }

    private static void adicionarAgua(){
        System.out.println("Tentando colocar água na máquina.");
        maquinaBanho.adicionarAgua();
    }

    private static void adicionarShampoo(){
        System.out.println("Tentando colocar shampoo na máquina.");
        maquinaBanho.adicionarShampoo();
    }

    private static void verificaAgua() {
        var quantia = maquinaBanho.getAgua();
        System.out.println("A máquina está no momento com " + quantia +" litro(s) de água.");
    }

    private static void verificaShampoo() {
        var quantia = maquinaBanho.getShampoo();
        System.out.println("A máquina está no momento com " + quantia +" litro(s) de shampoo.");
    }

    public static void verificaSeTemAnimalNaMaquina(){
        var temAnimal = maquinaBanho.temAnimal();
        System.out.println(temAnimal ? "Tem animal na máquina!" : "Não tem animal na máquina!");
    }

    public static void colocarAnimalNaMaquina(){
        String nome = "";

        while(nome == null || nome.isEmpty()){
            System.out.println("Informe o nome do animal: ");
            nome = scanner.nextLine();
        }
        var animal = new Animal(nome);
        maquinaBanho.setAnimal(animal);
    }
}