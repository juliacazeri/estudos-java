package Aula09;

import java.util.Scanner;

public class Desafio02{

    static class ContaBancaria{
        private int numero;
        private String titular;
        private double saldo;

        public ContaBancaria(int numero, String titular, double saldo){
            this.numero = numero;
            this.titular = titular;

            if(saldo < 0){
                System.out.println("Erro: O saldo nao pode ser negativo.");
                this.saldo = 0;
                return;
            }
            this.saldo = saldo;
        }

        public void depositar(double valor){
            if (valor <= 0){
                System.out.println("Erro: O valor do deposito deve ser positivo.");
                return;
            }
            saldo += valor;
        }

        public void exibirSaldo(){
            System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f\n", numero, titular, saldo);
        }
    }

    public class contaBancariApp{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int numero = scanner.nextInt();
            scanner.nextLine();
            String titular = scanner.nextLine();
            double saldo = scanner.nextDouble();

            if(saldo < 0){
                System.out.println("Erro: O saldo não pode ser negativo.");
                scanner.close();
                return;
            }
            double deposito = scanner.nextDouble();

            if (deposito <= 0){
                System.out.println("Erro: O valor do depósito deve ser positivo.");
                scanner.close();
                return;
            }

            ContaBancaria conta = new ContaBancaria(numero, titular, saldo);
            conta.depositar(deposito);
            conta.exibirSaldo();
            scanner.close();
        }
    }
}