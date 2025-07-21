package Aula08.Exemplos.Exemplo03.keyword;

public final class Cliente{
    private static String staticNome;

    private Cliente(){

    }

    public static String getStaticNome(){
        return staticNome;
    }

    public static void setStaticNome(String param){
        staticNome = param;
    }
}