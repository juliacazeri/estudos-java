package Aula07.Exercicios.Exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaApp{
    private final static Scanner scanner = new Scanner(System.in);
    private static List<Ingresso> ingressos = new ArrayList<>();

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Menu Cinema. =====");
            System.out.println("1 - Cadastrar ingresso normal.");
            System.out.println("2 - Cadastrar meia entrada.");
            System.out.println("3 - Cadastrar ingresso família.");
            System.out.println("4 - Exibir todos os ingressos.");
            System.out.println("5 - Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    cadastrarIngressoNormal();
                    break;
                case 2:
                    cadastrarMeiaEntrada();
                    break;
                case 3:
                    cadastrarIngressoFamilia();
                    break;
                case 4:
                    exibirIngressos();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(true);
    }

    private static void cadastrarIngressoNormal(){
        System.out.println("Informe o nome do filme: ");
        String filme = scanner.nextLine();

        System.out.println("Informe se o filme é dublado ou legendado: ");
        String tipoAudio = scanner.nextLine();

        System.out.println("Informe o valor do ingresso: ");
        double valorBase = scanner.nextDouble();
        scanner.nextLine();

        Ingresso ingresso = new IngressoNormal(valorBase, filme, tipoAudio);
        ingressos.add(ingresso);

        System.out.println("Ingresso comprado com sucesso!");
    }

    public static void cadastrarMeiaEntrada(){
        System.out.println("Informe o nome do filme: ");
        String filme = scanner.nextLine();

        System.out.println("Informe se o filme é dublado ou legendado: ");
        String tipoAudio = scanner.nextLine();

        System.out.println("Informe o valor do ingresso: ");
        double valorBase = scanner.nextDouble();
        scanner.nextLine();

        Ingresso ingresso = new MeiaEntrada();
        ingresso.setFilme(filme);
        ingresso.setTipoAudio(tipoAudio);
        ingresso.setValorBase(valorBase);
        ingressos.add(ingresso);

        System.out.println("Ingresso comprado com sucesso!");
    }

    public static void cadastrarIngressoFamilia(){
        System.out.println("Informe o nome do filme: ");
        String filme = scanner.nextLine();

        System.out.println("Informe se o filme é dublado ou legendado: ");
        String tipoAudio = scanner.nextLine();

        System.out.println("Informe o valor do ingresso: ");
        double valorBase = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe o número de pessoas: ");
        int numeroPessoas = scanner.nextInt();
        scanner.nextLine();

        IngressoFamilia ingressoFamilia = new IngressoFamilia();
        ingressoFamilia.setFilme(filme);
        ingressoFamilia.setTipoAudio(tipoAudio);
        ingressoFamilia.setValorBase(valorBase);
        ingressoFamilia.setNumeroPessoas(numeroPessoas);
        ingressos.add(ingressoFamilia);

        System.out.println("Ingressos comprados com sucesso!");
    }

    public static void exibirIngressos(){
        if (ingressos.isEmpty()) {
            System.out.println("Nenhum ingresso foi comprado ainda.");
            return;
        }
        System.out.println("\n===== Lista de Ingressos =====");
        for (int i = 0; i < ingressos.size(); i++) {
            Ingresso ingresso = ingressos.get(i);

            System.out.printf("%d) Filme: %s | Tipo de áudio: %s | Valor final: R$ %.2f%n", i + 1, ingresso.getFilme(), ingresso.getTipoAudio(), ingresso.calcularValorFinal());
        }
    }
}