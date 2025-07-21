package Aula08.Exercicios.Exercicio02;

public sealed abstract class Produto permits Alimentacao, SaudeBemEstar, Vestuario, Cultura{
    protected String nomeProduto;
    protected double precoProduto;

    public Produto(String nomeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public abstract double calcularImposto();

    public String getNomeProduto(){
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto(){
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto){
        this.precoProduto = precoProduto;
    }
}