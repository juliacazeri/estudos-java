package Aula07.Exercicios.Exercicio02;

public sealed abstract class Usuario permits Gerente, Vendedor, Atendente{
    protected String nomeFuncionario;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public String getNomeFuncionario(){
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean isAdministrador(){
        return administrador;
    }

    protected void setAdministrador(boolean administrador){
        this.administrador = administrador;
    }
}