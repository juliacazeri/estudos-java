package Aula10.Exercicios.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
    private List<Integer> numeros;

    public SomaNumeros(){
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        if(numeros.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        int maior = numeros.get(0);
        for(int numero : numeros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        if(numeros.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        int menor = numeros.get(0);
        for(int numero : numeros){
            if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return new ArrayList<>(numeros);
    }

    public static void main(String[] args){
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(10);
        soma.adicionarNumero(20);
        soma.adicionarNumero(5);

        System.out.println("Números: " + soma.exibirNumeros());
        System.out.println("Soma: " + soma.calcularSoma());
        System.out.println("Maior: " + soma.encontrarMaiorNumero());
        System.out.println("Menor: " + soma.encontrarMenorNumero());
    }
}