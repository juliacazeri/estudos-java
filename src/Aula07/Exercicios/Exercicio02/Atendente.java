package Aula07.Exercicios.Exercicio02;

public non-sealed class Atendente extends Usuario{
    private double valorEmCaixa;

    public Atendente(String nomeFuncionario, String email, String senha, double valorEmCaixa){
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
        this.valorEmCaixa = valorEmCaixa;
    }
    public double getValorEmCaixa(){
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa){
        this.valorEmCaixa = valorEmCaixa;
    }
}