package Aula09;

import java.util.Scanner;

public class Desafio01{

    private static class Pedido{
        private int id;
        private String nomeCliente;
        private double valorTotal;

        public Pedido(int id, String nomeCliente, double valorTotal){
            this.id = id;
            this.nomeCliente = nomeCliente;
            this.valorTotal = valorTotal;
        }

        public void exibirPedido(){
            System.out.printf("Pedido #%d - Cliente: %s - Total: R$%.2f", id, nomeCliente, valorTotal);
        }
    }

    public class pedidoApp{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            int id = Integer.parseInt(scanner.nextLine());
            String nomeCliente = scanner.nextLine();
            double valorTotal = Double.parseDouble(scanner.nextLine());

            Pedido pedido = new Pedido(id, nomeCliente, valorTotal);
            pedido.exibirPedido();

            scanner.close();
        }
    }
}