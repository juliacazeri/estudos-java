package Aula05;

import java.util.Scanner;

public class Desafio01 {

    public static void main (String[] args){
        Scanner leitorDeEntradas = new Scanner(System.in);

        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;

        if(valorSalario >= 0.00 && valorSalario <= 1100.00){
            valorImposto = 0.05F * valorSalario;
        } else if(valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        } else{
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}