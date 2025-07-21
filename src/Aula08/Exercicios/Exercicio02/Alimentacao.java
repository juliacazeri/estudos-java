package Aula08.Exercicios.Exercicio02;

public final class Alimentacao extends Produto{
    public Alimentacao(String nomeProduto, double precoProduto){
        super(nomeProduto, precoProduto);
    }

    @Override
    public double calcularImposto() {
        return precoProduto * 0.01;
    }
}