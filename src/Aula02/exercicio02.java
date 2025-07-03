package Aula02;

import java.util.Scanner;

public class exercicio02 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a sua altura (em m): ");
        float altura = scanner.nextFloat();

        System.out.println("Insira seu peso (em kg): ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if(imc <= 18.5){
            System.out.printf("Seu IMC é %.2f. Você está abaixo do peso.", imc);
        } else if(imc > 18.5 && imc <= 24.9){
            System.out.printf("Seu IMC é %.2f. Você está no peso ideal.", imc);
        } else if(imc >= 25 && imc <= 29.9){
            System.out.printf("Seu IMC é %.2f. Você está levemente acima do peso.", imc);
        } else if(imc >= 30 && imc <= 34.9){
            System.out.printf("Seu IMC é %.2f. Você tem obesidade grau I.", imc);
        } else if(imc >= 35 && imc <= 39.9){
            System.out.printf("Seu IMC é %.2f. Você tem obesidade grau II (severa).", imc);
        } else{
            System.out.printf("Seu IMC é %.2f. Você tem obesidade grau III (mórbida).", imc);
        }
        scanner.close();
    }
}