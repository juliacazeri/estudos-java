package Aula16;

import java.util.Scanner;

public class Desafio01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        scanner.close();

        if (validarSenha(senha)){
            System.out.println("senha valida");
        } else{
            System.out.println("senha invalida");
        }
    }

    public static boolean validarSenha(String senha){
        if (senha == null || senha.length() < 8){
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++){
            char c = senha.charAt(i);
            if(Character.isUpperCase(c)){
                temMaiuscula = true;
            } else if(Character.isLowerCase(c)){
                temMinuscula = true;
            } else if(Character.isDigit(c)){
                temNumero = true;
            }

            if(temMaiuscula && temMinuscula && temNumero){
                return true;
            }
        }
        return false;
    }
}