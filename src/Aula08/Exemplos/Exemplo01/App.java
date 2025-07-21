package Aula08.Exemplos.Exemplo01;

public class App{

    public static void main (String [] args){
        executarMusica(new Computador());
        executarVideo(new Computador());
    }

    public static void executarVideo(VideoPlayer videoPlayer){
        videoPlayer.reproduzirVideo();
    }

    public static void executarMusica(MusicaPlayer musicaPlayer){
        musicaPlayer.reproduzirMusica();
    }
}