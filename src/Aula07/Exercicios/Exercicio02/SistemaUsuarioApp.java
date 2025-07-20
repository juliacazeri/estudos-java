package Aula07.Exercicios.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaUsuarioApp{
    private final static Scanner scanner = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Sistema de Usuário =====");
            System.out.println("1- Cadastrar Gerente.");
            System.out.println("2- Cadastrar Vendedor.");
            System.out.println("3- Cadastrar Atendente.");
            System.out.println("4- Listar todos os usuários cadastrados.");
            System.out.println("5- Sair.");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    cadastrarGerente();
                    break;
                case 2:
                    cadastrarVendedor();
                    break;
                case 3:
                    cadastrarAtendente();
                    break;
                case 4:
                    listarUsuariosCadastrados();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(true);
    }

    private static void cadastrarGerente(){
        System.out.println("Informe o nome do Gerente: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Informe o email do Gerente: ");
        String email = scanner.nextLine();

        System.out.println("Informe a senha do Gerente: ");
        String senha = scanner.nextLine();

        Gerente gerente = new Gerente(nomeFuncionario, email, senha, true);
        usuarios.add(gerente);

        System.out.println("Gerente cadastrado com sucesso!");
    }

    private static void cadastrarVendedor(){
        System.out.println("Informe o nome do Vendedor: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Informe o email do Vendedor: ");
        String email = scanner.nextLine();

        System.out.println("Informe a senha do Vendedor: ");
        String senha = scanner.nextLine();

        System.out.println("Informe a quantidade de vendas do Vendedor: ");
        int quantidadeVendas = scanner.nextInt();
        scanner.nextLine();

        Vendedor vendedor = new Vendedor(nomeFuncionario, email, senha, quantidadeVendas);
        usuarios.add(vendedor);

        System.out.println("Vendedor cadastrado com sucesso!");
    }

    private static void cadastrarAtendente(){
        System.out.println("Informe o nome do Atendente: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Informe o email do Atendente: ");
        String email = scanner.nextLine();

        System.out.println("Informe a senha do Atendente: ");
        String senha = scanner.nextLine();

        System.out.println("Informe o valor em caixa do Atendente: ");
        double valorEmCaixa = scanner.nextDouble();
        scanner.nextLine();

        Atendente atendente = new Atendente(nomeFuncionario, email, senha, valorEmCaixa);
        usuarios.add(atendente);

        System.out.println("Atendente cadastrado com sucesso!");
    }

    private static void listarUsuariosCadastrados(){
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuário foi cadastrado.");
            return;
        }
        System.out.println("\n===== Lista de Usuários =====");
        for(Usuario usuario : usuarios){
            System.out.println("Nome: " + usuario.getNomeFuncionario() + ".");
            System.out.println("Email: " + usuario.getEmail() + ".");
            System.out.println("Administrador: " + (usuario.isAdministrador() ? "Sim" : "Não") + ".");
        }
    }
}