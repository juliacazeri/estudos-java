package Aula08.Exercicios.Exercicio02;

public final class Cultura extends Produto{
    public Cultura(String nomeProduto, double precoProduto){
        super(nomeProduto, precoProduto);
    }

    @Override
    public double calcularImposto(){
        return precoProduto * 0.04;
    }
}