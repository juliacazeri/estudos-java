package Aula08.Exercicios.Exercicio03;

public sealed abstract class FiguraGeometrica permits Quadrado, Retangulo, Circulo{

    public abstract double calcularArea();
}