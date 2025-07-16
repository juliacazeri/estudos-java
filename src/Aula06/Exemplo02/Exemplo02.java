package Aula06.Exemplo02;

public class Exemplo02 {

    public static void main (String[] args){
        Pessoa02 homem = new Pessoa02("João");
        homem.incAge();

        Pessoa02 mulher = new Pessoa02("Maria");
        mulher.incAge();

        System.out.println("Nome do Homem: " + homem.getNome02() + ". Idade: " + homem.getIdade02() + ".");
        System.out.println("Nome da Mulher: " + mulher.getNome02() + ". Idade: " + mulher.getIdade02() + ".");

    }
}
