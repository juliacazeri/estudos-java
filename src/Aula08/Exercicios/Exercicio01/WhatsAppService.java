package Aula08.Exercicios.Exercicio01;

public class WhatsAppService implements ServicoMensagem{
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando mensagem no WhatsApp: " + mensagem);
    }
}