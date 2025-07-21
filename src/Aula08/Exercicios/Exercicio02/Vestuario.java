package Aula08.Exercicios.Exercicio02;

public final class Vestuario extends Produto{
    public Vestuario(String nomeProduto, double precoProduto){
        super(nomeProduto, precoProduto);
    }

    @Override
    public double calcularImposto() {
        return precoProduto * 0.025;
    }
}