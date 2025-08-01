package Aula08.Exercicios.Exercicio03;

public final class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}