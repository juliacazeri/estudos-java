package Aula07.Exercicios.Exercicio03;

public class FusoHorario{

    public static void main (String[] args){
        Relogio brlRelogio = new BRLRelogio();
        brlRelogio.setSegundo(0);
        brlRelogio.setMinuto(0);
        brlRelogio.setHora(14);

        System.out.println(brlRelogio.getTempo());

        System.out.println(new USRelogio().converte(brlRelogio).getTempo());
    }
}