package Aula08.Exemplos.Exemplo03;

import static Aula08.Exemplos.Exemplo03.keyword.Cliente.getStaticNome;
import static Aula08.Exemplos.Exemplo03.keyword.Cliente.setStaticNome;

public class Main{

    public static void main (String[] args){
        setStaticNome("teste");
        System.out.println(getStaticNome());
    }
}