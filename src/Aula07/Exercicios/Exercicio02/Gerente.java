package Aula07.Exercicios.Exercicio02;

public non-sealed class Gerente extends Usuario{
    public Gerente(String nomeFuncionario, String email, String senha, boolean administrador){
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;
        this.senha = senha;
        this.administrador = true;
    }
}