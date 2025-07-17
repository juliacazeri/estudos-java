package Aula06.Exercicios.Exercicio01;

import java.util.Scanner;

public class BancoApp{
    private final static Scanner scanner = new Scanner(System.in);
    private static ContaBancaria contaBancaria = null;

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Bem-vindo ao banco. =====");
            System.out.println("1- Criar nova conta.");
            System.out.println("2- Consultar saldo.");
            System.out.println("3- Consultar cheque especial.");
            System.out.println("4- Depositar dinheiro.");
            System.out.println("5- Sacar dinheiro.");
            System.out.println("6- Pagar boleto.");
            System.out.println("7- Verificar uso do cheque especial.");
            System.out.println("8- Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(contaBancaria == null && opcao != 1 && opcao != 8){
                System.out.println("Você precisa criar uma conta bancária!");
            }
            switch(opcao){
                case 1:
                    criarConta();
                    break;
                case 2:
                    consultarSaldo();
                    break;
                case 3:
                    consultarChequeEspecial();
                    break;
                case 4:
                    depositar();
                    break;
                case 5:
                    sacar();
                    break;
                case 6:
                    pagarBoleto();
                    break;
                case 7:
                    verificarUsoDoChequeEspecial();
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

    private static void criarConta(){
        System.out.println("Informe o número da conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print("Informe o valor inicial da conta: ");
        double valorInicial = scanner.nextDouble();
        scanner.nextLine();

        contaBancaria = new ContaBancaria(numeroDaConta, titular, valorInicial);
        System.out.println("Sua conta foi criada com sucesso!");
    }

    private static void consultarSaldo(){
        contaBancaria.consultarSaldo();
    }

    private static void consultarChequeEspecial(){
        contaBancaria.consultarChequeEspecial();
    }

    private static void depositar(){
        System.out.println("Informe o valor do depósito: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        contaBancaria.depositar(valor);
    }

    private static void sacar(){
        System.out.println("Informe o valor do saque: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        contaBancaria.sacar(valor);
    }
    private static void pagarBoleto(){
        System.out.println("Informe o valor do boleto: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        contaBancaria.pagarBoleto(valor);
    }

    private static void verificarUsoDoChequeEspecial(){
        boolean uso = contaBancaria.verificarUsoChequeEspecial();
        System.out.println("O seu cheque especial está em uso?" + (uso ? "Sim." : "Não"));
    }
}