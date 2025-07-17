package Aula06.Exercicios.Exercicio03;

public class Animal{

    private final String nome;
    private boolean limpo;

    public Animal(String nome){
        this.nome = nome;
        this.limpo = false;
    }

    public String getNome(){
        return nome;
    }
    public boolean isLimpo(){
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}