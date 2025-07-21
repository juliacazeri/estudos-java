package Aula08.Exercicios.Exercicio01;

import java.util.Scanner;

public class MarketingApp{
    private final static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        int opcao = -1;

        do{
            System.out.println("===== Menu Envio de Mensagem =====");
            System.out.println("1- Enviar mensagem por SMS.");
            System.out.println("2- Enviar mensagem por e-mail.");
            System.out.println("3- Enviar mensagem por redes sociais.");
            System.out.println("4- Enviar mensagem por WhatsApp.");
            System.out.println("5- Sair.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    enviarPorSMS();
                    break;
                case 2:
                    enviarPorEmail();
                    break;
                case 3:
                    enviarPorRedesSociais();
                    break;
                case 4:
                    enviarPorWhatsApp();
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

    public static void enviarPorSMS(){
        System.out.println("Digite a mensagem para enviar por SMS: ");
        String mensagem = scanner.nextLine();

        ServicoMensagem servicoMensagem = new SmsService();
        servicoMensagem.enviarMensagem(mensagem);
    }

    public static void enviarPorEmail(){
        System.out.println("Digite a mensagem para enviar por e-mail: ");
        String mensagem = scanner.nextLine();

        ServicoMensagem servicoMensagem = new EmailService();
        servicoMensagem.enviarMensagem(mensagem);
    }

    public static void enviarPorRedesSociais(){
        System.out.println("Digite a mensagem para enviar pelas redes sociais: ");
        String mensagem = scanner.nextLine();

        ServicoMensagem servicoMensagem = new RedesSociaisService();
        servicoMensagem.enviarMensagem(mensagem);
    }

    public static void enviarPorWhatsApp(){
        System.out.println("Digite a mensagem para enviar por WhatsApp: ");
        String mensagem = scanner.nextLine();

        ServicoMensagem servicoMensagem = new WhatsAppService();
        servicoMensagem.enviarMensagem(mensagem);
    }
}