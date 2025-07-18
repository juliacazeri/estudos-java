package Aula07.Exemplos.Exemplo01;

public class Informacoes01 {

    public static void main (String[] args){
        imprimirFuncionario(new Gerente01());
        imprimirFuncionario(new Vendedor01());
    }

    public static void imprimirFuncionario(Funcionario01 funcionario){
        System.out.printf("======%s=====\n", funcionario.getClass().getSimpleName());

        if(funcionario instanceof Gerente01 gerente){

        }
        switch(funcionario){
            case Gerente01 gerente:
                gerente.setCodigo("123");
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha("123456");
                gerente.setComissao(1200);

                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());
                break;

            case Vendedor01 vendedor:
                vendedor.setCodigo("456");
                vendedor.setNome("Lucas");
                vendedor.setSalario(2800);
                vendedor.setPorcentagemPorVenda(10);
                vendedor.setValorVendido(1000);

                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getPorcentagemPorVenda());
                System.out.println(vendedor.getValorVendido());
                break;
        }
        System.out.println(funcionario.getSalarioIntegral());
        System.out.println("============\n");
    }
}