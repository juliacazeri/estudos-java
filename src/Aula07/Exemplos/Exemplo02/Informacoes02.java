package Aula07.Exemplos.Exemplo02;

public class Informacoes02{

    public static void main (String[] args){
        Funcionario02 funcionario02 = new Funcionario02();
        Vendedor02 vendedor02 = new Vendedor02();
        Gerente02 gerente02 = new Gerente02();

        System.out.println(gerente02 instanceof Funcionario02);
    }
}
