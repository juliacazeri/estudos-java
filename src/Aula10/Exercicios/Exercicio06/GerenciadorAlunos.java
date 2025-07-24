package Aula10.Exercicios.Exercicio06;

import java.util.*;

public class GerenciadorAlunos{
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for(Aluno a : alunoSet){
            if(a.getMatricula().equals(matricula)){
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public void exibirAlunos(){
        if(alunoSet.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
        } else{
            System.out.println("Lista de alunos:");
            for(Aluno a : alunoSet){
                System.out.println(a);
            }
        }
    }

    public void exibirAlunosPorNome(){
        List<Aluno> listaOrdenada = new ArrayList<>(alunoSet);
        listaOrdenada.sort(Comparator.comparing(Aluno::getNome));

        System.out.println("Alunos ordenados por nome:");
        for(Aluno a : listaOrdenada){
            System.out.println(a);
        }
    }

    public void exibirAlunosPorNota(){
        List<Aluno> listaOrdenada = new ArrayList<>(alunoSet);
        listaOrdenada.sort(Comparator.comparingDouble(Aluno::getMedia));

        System.out.println("Alunos ordenados por média:");
        for(Aluno a : listaOrdenada){
            System.out.println(a);
        }
    }

    public static void main(String[] args){
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();

        gerenciador.adicionarAluno("João", 2021001L, 8.5);
        gerenciador.adicionarAluno("Ana", 2021002L, 9.0);
        gerenciador.adicionarAluno("Carlos", 2021003L, 7.8);
        gerenciador.adicionarAluno("ana", 2021004L, 6.5);

        System.out.println();
        gerenciador.exibirAlunos();

        System.out.println();
        gerenciador.exibirAlunosPorNome();

        System.out.println();
        gerenciador.exibirAlunosPorNota();

        System.out.println("\nRemovendo aluno com matrícula 2021001...");
        gerenciador.removerAluno(2021001L);

        System.out.println();
        gerenciador.exibirAlunos();
    }
}