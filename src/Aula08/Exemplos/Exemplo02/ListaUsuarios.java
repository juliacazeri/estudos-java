package Aula08.Exemplos.Exemplo02;

import java.util.List;
import java.util.function.Function;

public class ListaUsuarios{

    public static void main (String[] args){
        List<Usuario> usuarios = List.of(new Usuario("Maria", 21), new Usuario("João", 32),
                new Usuario("Eduardo", 40), new Usuario("Ana", 19));

        imprimirValorString(Record::toString, usuarios);
    }

    private static void imprimirValorString(Function<Usuario, String> callback, List<Usuario> usuarios){
        usuarios.forEach(u -> System.out.println(callback.apply(u)));
    }
}