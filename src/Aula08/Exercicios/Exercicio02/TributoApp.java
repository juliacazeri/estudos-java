package Aula08.Exercicios.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TributoApp{
    private final static Scanner scanner = new Scanner(System.in);
    private static List<Produto> produtos = new ArrayList<>();

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Menu Calculo Tributário =====");
            System.out.println("1- Cadastrar produto de alimentação.");
            System.out.println("2- Cadastrar produto de saúde e bem-estar.");
            System.out.println("3- Cadastrar produto de vestuário.");
            System.out.println("4- Cadastrar produto de cultura.");
            System.out.println("5- Listar todos os produtos e seus impostos.");
            System.out.println("6- Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    cadastrarAlimentação();
                    break;
                case 2:
                    cadastrarSaudeBemEstar();
                    break;
                case 3:
                    cadastrarVestuario();
                    break;
                case 4:
                    cadastrarCultura();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(true);
    }

    private static void cadastrarAlimentação(){
        System.out.println("Informe o nome do produto de alimentação: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe o preço do produto de alimentação: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Alimentacao(nomeProduto, precoProduto);
        produtos.add(produto);

        System.out.println("Produto de alimentação cadastrado com sucesso!");
    }

    private static void cadastrarSaudeBemEstar(){
        System.out.println("Informe o nome do produto de saúde e bem-estar: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe o preço do produto de saúde e bem-estar: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new SaudeBemEstar(nomeProduto, precoProduto);
        produtos.add(produto);

        System.out.println("Produto de saúde e bem-estar cadastrado com sucesso!");
    }

    private static void cadastrarVestuario(){
        System.out.println("Informe o nome do produto de vestuário: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe o preço do produto de vestuário: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Vestuario(nomeProduto, precoProduto);
        produtos.add(produto);

        System.out.println("Produto de vestuário cadastrado com sucesso!");
    }

    private static void cadastrarCultura(){
        System.out.println("Informe o nome do produto de cultura: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Informe o preço do produto de cultura: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Cultura(nomeProduto, precoProduto);
        produtos.add(produto);

        System.out.println("Produto de cultura cadastrado com sucesso!");
    }

    private static void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto foi cadastrado ainda;");
            return;
        }
        System.out.println("\n ===== Lista de Produtos =====");
        for(Produto produto : produtos){
            System.out.println("Produto: " + produto.getNomeProduto() + ".");
            System.out.println("Preço: R$" + produto.getPrecoProduto() + ".");
            System.out.println("Imposto: " + produto.calcularImposto() + ".");
            System.out.println("=============================");
        }
    }
}