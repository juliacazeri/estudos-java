package Aula07.Exercicios.Exercicio01;

public non-sealed class IngressoNormal extends Ingresso{
    public IngressoNormal(double valorBase, String filme, String tipoAudio){
        this.valorBase = valorBase;
        this.filme = filme;
        this.tipoAudio = tipoAudio;
    }

    @Override
    public double calcularValorFinal(){
        return valorBase;
    }
}
