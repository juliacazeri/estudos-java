package Aula06.Exemplos.Exemplo02;

import java.time.OffsetDateTime;

public class Pessoa02 {
    private final String nome02;

    private int idade02;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Pessoa02(String nome02){
        this.nome02 = nome02;
        this.idade02 = 1;
    }

    public String getNome02(){
        return this.nome02;
    }
    public int getIdade02(){
        return this.idade02;
    }

    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear())
            return;

        this.idade02 +=1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
