package Aula07.Exercicios.Exercicio03;

public non-sealed class BRLRelogio extends Relogio{

    @Override
    public Relogio converte(final Relogio relogio){
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();

        switch(relogio){
            case USRelogio usRelogio:
                this.hora = (usRelogio.getIndicadorDePeriodo().equals("PM")) ? usRelogio.getHora() + 12 : usRelogio.getHora();
                break;

            case BRLRelogio brlRelogio:
                this.hora = brlRelogio.getHora();
                break;
        }
        return this;
    }
}