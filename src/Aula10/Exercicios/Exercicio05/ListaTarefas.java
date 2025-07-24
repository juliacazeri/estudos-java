package Aula10.Exercicios.Exercicio05;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas{
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("Lista de tarefas está vazia.");
        } else{
            System.out.println("Lista de tarefas:");
            for(Tarefa t : tarefaSet){
                System.out.println(t);
            }
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluídas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isConcluida()){
                concluídas.add(t);
            }
        }
        return concluídas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isConcluida()){
                pendentes.add(t);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main (String[] args){
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Ler um livro");

        System.out.println("Total de tarefas: " + lista.contarTarefas());

        lista.marcarTarefaConcluida("Estudar Java");

        System.out.println("\nTarefas concluídas:");
        System.out.println(lista.obterTarefasConcluidas());

        System.out.println("\nTarefas pendentes:");
        System.out.println(lista.obterTarefasPendentes());

        lista.exibirTarefas();

        lista.removerTarefa("Ler um livro");
        System.out.println("\nApós remover uma tarefa:");
        lista.exibirTarefas();

        lista.limparListaTarefas();
        System.out.println("\nApós limpar a lista:");
        lista.exibirTarefas();
    }
}