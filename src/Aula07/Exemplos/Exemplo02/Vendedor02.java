package Aula07.Exemplos.Exemplo02;

public class Vendedor02 extends Funcionario02{
    private double porcentagemPorVenda;
    private double valorVendido;

    public Vendedor02(String codigo, String nome, String endereco, int idade, double salario, double porcentagemPorVenda, double valorVendido){
        super(codigo, nome, endereco, idade, salario);
        this.porcentagemPorVenda = porcentagemPorVenda;
        this.valorVendido = valorVendido;
    }

    @Override
    public String getCodigo(){
        return "VD" + this.codigo;
    }

    public double getSalarioIntegral(){
        return this.salario + ((valorVendido * porcentagemPorVenda) / 100);
    }

    public Vendedor02(){
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
