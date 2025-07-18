package Aula07.Exemplos.Exemplo01;

public non-sealed class Gerente01 extends Funcionario01 {
    private String login;
    private String senha;
    private double comissao;

    public Gerente01(String codigo, String nome, String endereco, int idade, double salario, String login, String senha, double comissao){
        super(codigo, nome, endereco, idade, salario);
        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    @Override
    public String getCodigo(){
        return "GR" + this.codigo;
    }

    @Override
    public double getSalarioIntegral(){
        return this.salario + this.comissao;
    }

    public Gerente01(){
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }
}