package Aula17.Exemplo01;

// Singleton "preguiçoso".

public class SingletonLazy{
    private static SingletonLazy instancia;

    public SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}