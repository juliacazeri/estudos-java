package Aula01;

public class exemplo11 {
    public static void main (String args[]){
        // Operadores Bitwise (NEGAÇÃO)
        var valor1 = -789;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);

        var resultado = ~valor1;
        var resultadoBinario = Integer.toBinaryString(resultado);
        System.out.printf("~%s = %s (representação binária %s)\n", valor1, resultado, resultadoBinario);
    }
}