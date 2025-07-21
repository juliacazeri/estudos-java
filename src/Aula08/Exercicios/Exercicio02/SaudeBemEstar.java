package Aula08.Exercicios.Exercicio02;

public final class SaudeBemEstar extends Produto{
    public SaudeBemEstar(String nomeProduto, double precoProduto){
        super(nomeProduto, precoProduto);
    }

    @Override
    public double calcularImposto(){
        return precoProduto * 0.015;
    }
}