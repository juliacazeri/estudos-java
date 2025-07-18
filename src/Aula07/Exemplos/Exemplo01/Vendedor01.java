package Aula07.Exemplos.Exemplo01;

public non-sealed class Vendedor01 extends Funcionario01 {
    private double porcentagemPorVenda;
    private double valorVendido;

    public Vendedor01(String codigo, String nome, String endereco, int idade, double salario, double porcentagemPorVenda, double valorVendido){
        super(codigo, nome, endereco, idade, salario);
        this.porcentagemPorVenda = porcentagemPorVenda;
        this.valorVendido = valorVendido;
    }

    @Override
    public String getCodigo(){
        return "VD" + this.codigo;
    }

    @Override
    public double getSalarioIntegral(){
        return this.salario + ((valorVendido * porcentagemPorVenda) / 100);
    }

    public Vendedor01(){
    }

    public double getPorcentagemPorVenda(){
        return porcentagemPorVenda;
    }

    public void setPorcentagemPorVenda(double porcentagemPorVenda){
        this.porcentagemPorVenda = porcentagemPorVenda;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
}