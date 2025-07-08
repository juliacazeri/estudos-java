package Aula03.app;

import Aula03.dao.UserDAO;
import Aula03.exception.CustomException;
import Aula03.exception.EmptyStorageExcetion;
import Aula03.exception.UserNotFoundException;
import Aula03.exception.ValidatorException;
import Aula03.model.MenuOption;
import Aula03.model.UserModel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Aula03.validator.UserValidator.verifyModel;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Bem-vindo ao cadastro de usuários, selecione a operação desejada.");
            System.out.println("1- Cadastrar.");
            System.out.println("2- Atualizar.");
            System.out.println("3- Excluir.");
            System.out.println("4- Buscar por Id.");
            System.out.println("5- Listar.");
            System.out.println("6- Sair.");

            int opcaoEntrada = scanner.nextInt();
            scanner.nextLine();

            var opcaoSelecionada = MenuOption.values()[opcaoEntrada - 1];

            switch(opcaoSelecionada) {
                case SAVE -> {
                    try {
                        var usuario = dao.salvar(requestToSave());
                        System.out.printf("Usuário cadastrado: %s%n.", usuario);
                    } catch(CustomException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                case UPDATE -> {
                    try {
                        var usuario = dao.atualizar(requestToUpdate());
                        System.out.printf("Usuário atualizado: %s%n.", usuario);
                    } catch(UserNotFoundException | EmptyStorageExcetion ex) {
                        System.out.println(ex.getMessage());
                    } catch(CustomException ex) {
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                    finally {
                        System.out.println("======================");
                    }
                }
                case DELETE -> {
                    try {
                        dao.deletar(requestId());
                        System.out.println("Usuário excluído.");
                    } catch(UserNotFoundException | EmptyStorageExcetion ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("======================");
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var usuario = dao.procuraPorId(id);
                        System.out.printf("Usuário com id %s: %s%n.", id, usuario);
                    } catch(UserNotFoundException | EmptyStorageExcetion ex) {
                        System.out.println(ex.getMessage());
                    } finally {
                        System.out.println("======================");
                    }
                }
                case FIND_ALL -> {
                    var usuarios = dao.encontraTudo();
                    System.out.println("Usuários cadastrados.");
                    System.out.println("========== Início ==========");
                    usuarios.forEach(System.out::println);
                    System.out.println("=========== Fim ===========");
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId() {
        System.out.println("Informe o id do usuário: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        return id;
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o e-mail do usuário: ");
        String email = scanner.nextLine();

        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        String aniversarioString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var aniversario = LocalDate.parse(aniversarioString, formatter);

        return validarEntradas(0, nome, email, aniversario);
    }

    private static UserModel validarEntradas(final long id, final String nome, final String email, final LocalDate aniversario) {
        var usuario = new UserModel(0, nome, email, aniversario);
        try {
            verifyModel(usuario);
            return usuario;
        } catch(ValidatorException ex) {
            throw new CustomException("O seu usuário contém erros: " +ex.getMessage(), ex);
        }
    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o id do usuário: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Informe o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o e-mail do usuário: ");
        String email = scanner.nextLine();

        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        String aniversarioString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var aniversario = LocalDate.parse(aniversarioString, formatter);

        return validarEntradas(id, nome, email, aniversario);
    }
}