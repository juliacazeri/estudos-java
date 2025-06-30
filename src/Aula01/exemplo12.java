package Aula01;

public class exemplo12 {

    public static void main (String args[]){
        // Operadores Bitwise (left shift operator)
        var valor1 = 9;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);

        var valor2 = 2;
        System.out.printf("Segundo número da operação %s\n", valor2);

        var resultado = valor1 << valor2;
        var resultadoBinario = Integer.toBinaryString(resultado);
        System.out.printf("%s << %s = %s (representação binária %s)\n", valor1, valor2, resultado, resultadoBinario);
    }
}