package Aula19;

import Aula19.dao.BasicBasketDAO;
import Aula19.dao.MoneyDAO;
import Aula19.service.BasicBasketService;
import Aula19.service.MoneyService;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main{

    private final static MoneyService moneyService = new MoneyService(new MoneyDAO());
    private final static BasicBasketService basicBasketService = new BasicBasketService(new BasicBasketDAO(), moneyService);

    private final static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Bem-vindo ao sistema de armazém!");
        System.out.println("Selecione a opção desejada.");

        var option = -1;
        while(true){
            System.out.println("1- Verificar estoque de cesta básica.");
            System.out.println("2- Verificar caixa.");
            System.out.println("3- Receber cestas.");
            System.out.println("4- Vender cestas.");
            System.out.println("5- Remover itens vencidos.");
            System.out.println("6- Sair.");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    checkStock();
                    break;
                case 2:
                    checkMoney();
                    break;
                case  3:
                    receiveItems();
                    break;
                case 4:
                    soldItems();
                    break;
                case 5:
                    removeItemsOutOfDate();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void soldItems(){
        System.out.println("Quantas cestas serão vendidas.");
        var amount = scanner.nextInt();
        var total = basicBasketService.sold(amount);
        System.out.printf("O valor da venda é %s. \n", total);
    }

    private static void checkStock(){
        var stockInfo = basicBasketService.getInfo();
        System.out.printf("Existem %s cestas em estoque, das quais %s estão fora do prazo de validade.\n", stockInfo.total(), stockInfo.outOfDate());
    }

    private static void checkMoney(){
        System.out.printf("O caixa no momento é de %s.\n", moneyService);
    }

    private static void removeItemsOutOfDate(){
        var outOfDate = basicBasketService.removeOutOfDate();
        var lost = outOfDate.stream().map(BasicBasket::price).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.printf("Foram descartadas do estoque %s cestas vencidas, o prejuízo foi de %s.\n", outOfDate.size(), lost);
    }

    private static void receiveItems(){
        System.out.println("Informe o valor da entrega: ");
        var price = scanner.nextBigDecimal();
        System.out.println("Informe a quantidade de cestas da entrega: ");
        var amount = scanner.nextLong();
        System.out.println("Informe a data do vencimento: ");
        var stringValidate = scanner.next();

        var validate = toLocalDate(stringValidate);
        var box = new Box(amount, validate, price);
        var baskets = basicBasketService.receive(box);
        System.out.printf("Foram adicionadas %s cestas ao estoque.\n", baskets.size());
    }

    private static LocalDate toLocalDate(final String date){
        var splitDate = Stream.of(date.split("/")).mapToInt(Integer::parseInt).toArray();
        return LocalDate.of(splitDate[2], splitDate[1], splitDate[0]);
    }
}