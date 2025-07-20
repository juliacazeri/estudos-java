package Aula07.Exercicios.Exercicio02;

public non-sealed class Vendedor extends Usuario{
    private int quantidadeVendas;

    public Vendedor(String nomeFuncionario, String email, String senha, int quantidadeVendas){
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
        this.quantidadeVendas = quantidadeVendas;
    }

    public int getQuantidadeVendas(){
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas){
        this.quantidadeVendas = quantidadeVendas;
    }
}