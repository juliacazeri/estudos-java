package Aula07.Exercicios.Exercicio03;

public non-sealed class USRelogio extends Relogio{
    private String indicadorDePeriodo;

    public String getIndicadorDePeriodo(){
        return indicadorDePeriodo;
    }

    public void setPeriodoPM(){
        this.indicadorDePeriodo = "PM";
    }

    public void setPeriodoAM(){
        this.indicadorDePeriodo = "AM";
    }

    public void setHora(int hora){
        setPeriodoAM();
        if((hora > 12 ) && (hora <= 23)){
            setPeriodoPM();
            this.hora = hora - 12;
        } else if(hora >= 24){
            this.hora = 0;
        } else{
            this.hora = hora;
        }
    }

    @Override
    Relogio converte(Relogio relogio){
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();

        switch(relogio){
            case USRelogio usRelogio:
                this.hora = usRelogio.getHora();
                this.indicadorDePeriodo = usRelogio.getIndicadorDePeriodo();
                break;

            case BRLRelogio brlRelogio:
                this.setHora(brlRelogio.getHora());
                break;
        }
        return this;
    }

    @Override
    public String getTempo(){
        return super.getTempo() + " " + this.indicadorDePeriodo;
    }
}