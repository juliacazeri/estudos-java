package Aula08.Exercicios.Exercicio01;

public class SmsService implements ServicoMensagem{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}