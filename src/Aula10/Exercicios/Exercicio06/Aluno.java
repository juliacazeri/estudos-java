package Aula10.Exercicios.Exercicio06;

import java.util.Objects;

public class Aluno{
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media){
        this.nome = nome.trim();
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome(){
        return nome;
    }

    public Long getMatricula(){
        return matricula;
    }

    public double getMedia(){
        return media;
    }

    @Override
    public String toString(){
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matrícula=" + matricula +
                ", média=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula);
    }

    @Override
    public int hashCode(){
        return Objects.hash(matricula);
    }
}