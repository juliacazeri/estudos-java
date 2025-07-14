package Aula01.Exemplos;

public class Exemplo10 {

    public static void main (String args[]){
        // Operadores Bitwise (XOR)
        var valor1 = 6;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);

        var valor2 = 2;
        var binario2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valor2, binario2);

        var resultado = valor1 ^ valor2;
        var resultadoBinario = Integer.toBinaryString(resultado);
        System.out.printf("%s ^ %s = %s (representação binária %s)\n", valor1, valor2, resultado, resultadoBinario);
    }
}