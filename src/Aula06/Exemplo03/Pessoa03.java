package Aula06.Exemplo03;

public record Pessoa03(String nome03, int idade03){

    public Pessoa03{
        // Record é: imutável, não permite construtor sem argumentos,
        // só permite propriedades estáticas no corpo dele.
    }

    public Pessoa03(String nome03){
        this(nome03, 1);
    }

    public String getInfo(){
        return "Nome: " + nome03 + ". Idade: " + idade03 + ".";
    }
}