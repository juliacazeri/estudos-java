package Aula08.Exemplos.Exemplo01;

public class Celular implements VideoPlayer, MusicaPlayer {
    @Override
    public void reproduzirMusica(){
        System.out.println("O celular está reproduzindo a música.");
    }

    @Override
    public void pausaMusica(){
        System.out.println("O celular está pausando a música.");
    }

    @Override
    public void paraMusica(){
        System.out.println("O celular está parando a música.");
    }

    @Override
    public void reproduzirVideo(){
        System.out.println("O celular está reproduzindo o vídeo.");
    }

    @Override
    public void pausaVideo(){
        System.out.println("O celular está pausando o vídeo.");
    }

    @Override
    public void paraVideo(){
        System.out.println("O celular está parando o vídeo.");
    }
}