package Aula08.Exercicios.Exercicio01;

public class RedesSociaisService implements ServicoMensagem{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelas redes sociais: " + mensagem);
    }
}