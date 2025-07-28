package Aula12;

import java.util.Scanner;

public class Desafio02{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        scanner.close();

        if (validarIP(ip)){
            System.out.println("ip valido");
        } else{
            System.out.println("ip invalido");
        }
    }

    public static boolean validarIP(String ip){
        String[] partes = ip.split("\\.");
        if(partes.length != 4){
            return false;
        }

        for(String parte : partes){
            if(!ehNumeroValido(parte)){
                return false;
            }
        }
        return true;
    }

    private static boolean ehNumeroValido(String str){
        try {
            int num = Integer.parseInt(str);
            return num >= 0 && num <= 255;
        } catch(NumberFormatException e){
            return false;
        }
    }
}