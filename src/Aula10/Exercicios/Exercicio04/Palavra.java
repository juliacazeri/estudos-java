package Aula10.Exercicios.Exercicio04;

import java.util.Objects;

public class Palavra{
    private String texto;

    public Palavra(String texto){
        this.texto = texto.trim().toLowerCase();
    }

    public String getTexto(){
        return texto;
    }

    @Override
    public String toString(){
        return texto;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Palavra)) return false;
        Palavra palavra = (Palavra) o;
        return texto.equals(palavra.texto);
    }

    @Override
    public int hashCode(){
        return Objects.hash(texto);
    }
}