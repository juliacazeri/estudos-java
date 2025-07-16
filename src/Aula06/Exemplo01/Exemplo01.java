package Aula06.Exemplo01;

public class Exemplo01 {

    public static void main(String[] args) {
        Pessoa01 homem = new Pessoa01(); // ✅ construtor sem parâmetros
        homem.setNome("João");
        homem.setIdade(21);

        Pessoa01 mulher = new Pessoa01();
        mulher.setNome("Maria");
        mulher.setIdade(20);

        System.out.println("Nome do Homem: " + homem.getNome01() + ". Idade: " + homem.getIdade01() + ".");
        System.out.println("Nome da Mulher: " + mulher.getNome01() + ". Idade: " + mulher.getIdade01() + ".");
    }
}
