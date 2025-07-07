package Aula03.app;

import Aula03.dao.UserDAO;
import Aula03.model.MenuOption;
import Aula03.model.UserModel;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private final static UserDAO dao = new UserDAO();

    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        while (true){
            System.out.println("Bem-vindo ao cadastro de usuários, selecione a operação desejada");
            System.out.println("1- Cadastrar");
            System.out.println("2- Atualizar");
            System.out.println("3- Excluir");
            System.out.println("4- Buscar por Id");
            System.out.println("5- Listar");
            System.out.println("6- Sair");
            int opcaoEntrada = scanner.nextInt();

            var opcaoSelecionada = MenuOption.values()[opcaoEntrada -1];
            switch (opcaoSelecionada){
                case SAVE -> {
                    var usuario = dao.salvar(requestToSave());
                    System.out.printf("Usuário cadastrado %s.", usuario);
                }
                case UPDATE -> {
                    var usuario = dao.atualizar(requestToUpdate());
                    System.out.printf("Usuário atualizado %s.", usuario);

                }
                case DELETE -> {
                    dao.deletar(requestId());
                    System.out.println("Usuário excluído.");
                }
                case FIND_BY_ID -> {
                    var id = requestId();
                    var usuario = dao.procuraPorId(id);
                    System.out.printf("Usuário com id %s: ", id);
                    System.out.println(usuario);
                }
                case FIND_ALL -> {
                    var usuarios = dao.encontraTudo();
                   System.out.println("Usuários cadastrados");
                   System.out.println("==========Inicio==========");
                   usuarios.forEach(System.out::println);
                   System.out.println("==========Fim==========");
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId(){
        System.out.println("Informe o id do usuário:");
        return scanner.nextLong();
    }

    private static UserModel requestToSave(){
        System.out.println("Informe o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Informe o e-mail do usuário:");
        String email = scanner.nextLine();
        System.out.println("Informe a data de nascimento do usuário (dd/mm/yyyy):");
        String aniversarioString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        var aniversario = OffsetDateTime.parse(aniversarioString, formatter);
        return new UserModel(0, nome, email, aniversario);
    }
    private static UserModel requestToUpdate(){
        System.out.println("Informe o id do usuário:");
        long id = scanner.nextLong();
        System.out.println("Informe o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Informe o e-mail do usuário:");
        String email = scanner.nextLine();
        System.out.println("Informe a data de nascimento do usuário (dd/mm/yyyy):");
        String aniversarioString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        var aniversario = OffsetDateTime.parse(aniversarioString, formatter);
        return new UserModel(0, nome, email, aniversario);
    }
}