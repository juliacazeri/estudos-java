package Aula01.Exemplos;

public class Exemplo14 {
    public static void main (String args[]){
        // Operadores Bitwise (unsigned right shift operator)
        var valor1 = 12;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);

        var valor2 = 2;
        System.out.printf("Segundo número da operação %s\n", valor2);

        var resultado = valor1 >>> valor2;
        var resultadoBinario = Integer.toBinaryString(resultado);
        System.out.printf("%s >>> %s = %s (representação binária %s)\n", valor1, valor2, resultado, resultadoBinario);
    }
}