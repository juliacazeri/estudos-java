package Aula07.Exercicios.Exercicio01;

public non-sealed class IngressoFamilia extends Ingresso{
    private int numeroPessoas;

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double calcularValorFinal() {
        double total;

        if(numeroPessoas > 3){
            total = (valorBase * numeroPessoas) * 0.95;
        } else {
            total = valorBase * numeroPessoas;
        }
        return total;
    }
}