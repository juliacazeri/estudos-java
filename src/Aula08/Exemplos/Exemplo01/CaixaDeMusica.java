package Aula08.Exemplos.Exemplo01;

public class CaixaDeMusica implements MusicaPlayer {
    @Override
    public void reproduzirMusica() {
        System.out.println("A caixa de música está reproduzindo a música.");
    }

    @Override
    public void pausaMusica() {
        System.out.println("A caixa de música está pausando a música.");
    }

    @Override
    public void paraMusica() {
        System.out.println("A caixa de música está parando a música.");
    }
}