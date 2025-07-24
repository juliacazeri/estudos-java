package Aula10.Exercicios.Exercicio05;

import java.util.Objects;

public class Tarefa{
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao.trim();
        this.concluida = false;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean isConcluida(){
        return concluida;
    }

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }

    @Override
    public String toString(){
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Tarefa)) return false;
        Tarefa tarefa = (Tarefa) o;
        return descricao.equalsIgnoreCase(tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao.toLowerCase());
    }
}