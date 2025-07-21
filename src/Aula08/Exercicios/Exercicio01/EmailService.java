package Aula08.Exercicios.Exercicio01;

public class EmailService implements ServicoMensagem{
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println("Enviando e-mail: " + mensagem);
    }
}