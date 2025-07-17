package Aula06.Exercicios.Exercicio01;

public class ContaBancaria{

    private int numeroConta;
    private String titular;
    private double saldo;
    private double chequeEspecial;
    private double usoChequeEspecial;

    public ContaBancaria(int numeroConta, String titular, double valorInicial){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = valorInicial;

        if(valorInicial <= 5000.00){
            this.chequeEspecial = 50.00;
        } else{
            this.chequeEspecial = valorInicial * 0.5;
        }
    }

    public void consultarSaldo(){
        System.out.println("O seu saldo bancário é de R$" + saldo + ".");
    }

    public void consultarChequeEspecial(){
        System.out.println("O limite do seu cheque especial é de R$" + chequeEspecial + ".");
        System.out.println("O valor utilizado do seu cheque especial é de R$: " + usoChequeEspecial);
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("O valor é inválido para depósito!");
            return;
        }

        if(usoChequeEspecial > 0){
            double taxa = usoChequeEspecial * 0.2;
            double valorComTaxa = valor - taxa;

            if(valorComTaxa <= 0){
                System.out.println("Depósito insuficiente para cobrir a taxa de uso do chque especial!");
                return;
            }
            if(valorComTaxa >= usoChequeEspecial){
                valorComTaxa -= usoChequeEspecial;
                usoChequeEspecial = 0.0;
                saldo += valorComTaxa;
            } else{
                usoChequeEspecial -= valorComTaxa;
            }
            System.out.println("Depósito realizado com taxa de R$" + taxa + ".");
        } else{
            saldo += valor;
            System.out.println("Depósito realizado sem taxa!");
        }
        System.out.println("O seu saldo é de R$" + saldo + ".");
        System.out.println("O seu uso de cheque especial é de R$" + chequeEspecial + ".");
    }

    public void sacar(double valor){
        if(valor <= 0){
            System.out.println("O valor é inválido para saque.");
            return;
        }
        double saldoDisponivel = saldo + (chequeEspecial - usoChequeEspecial);

        if(valor > saldoDisponivel){
            System.out.println("O saldo e cheque especial são insuficientes para saque!");
            return;
        }

        if(valor <= saldo){
            saldo -= valor;
        } else{
            double valorCheque = valor - saldo;
            saldo = 0;
            usoChequeEspecial += valorCheque;
        }
        System.out.println("O seu saque de R$" + valor + " foi realizado com sucesso!");
        System.out.println("O seu saldo é de R$" + saldo + ".");
        System.out.println("O seu uso de cheque especial é de R$" + chequeEspecial + ".");
    }

    public void pagarBoleto (double valor){
        sacar(valor);
    }

    public boolean verificarUsoChequeEspecial(){
        return usoChequeEspecial > 0;
    }
}