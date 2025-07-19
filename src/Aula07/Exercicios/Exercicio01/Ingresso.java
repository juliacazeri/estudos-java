package Aula07.Exercicios.Exercicio01;

public sealed abstract class Ingresso permits MeiaEntrada, IngressoFamilia, IngressoNormal{
    protected double valorBase;
    protected String filme;
    protected String tipoAudio;

    public double getValorBase(){
        return valorBase;
    }

    public void setValorBase(double valorBase){
        this.valorBase = valorBase;
    }

    public String getFilme(){
        return filme;
    }

    public void setFilme(String filme){
        this.filme = filme;
    }

    public String getTipoAudio(){
        return tipoAudio;
    }

    public void setTipoAudio(String tipoAudio){
        this.tipoAudio = tipoAudio;
    }

    public abstract double calcularValorFinal();
}