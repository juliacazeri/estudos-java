package Aula10.Exercicios.Exercicio08;

public class Palavra{
    private String texto;
    private int contagem;

    public Palavra(String texto, int contagem){
        this.texto = texto;
        this.contagem = contagem;
    }

    public String getTexto(){
        return texto;
    }

    public int getContagem(){
        return contagem;
    }

    public void incrementar(){
        this.contagem++;
    }

    @Override
    public String toString(){
        return "Palavra{" +
                "texto='" + texto + '\'' +
                ", contagem=" + contagem +
                '}';
    }
}