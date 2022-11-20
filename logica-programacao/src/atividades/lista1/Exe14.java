package atividades.lista1;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {

        String nomeProduto;
        int qtdProduto;
        double precoUnidadeProduto;
        double valorTotalSemDesconto;
        double valorTotalDesconto;
        double valorTotalPagamento;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual produto você comprou?");
        nomeProduto = scanner.next();

        System.out.println("Quantos?");
        qtdProduto = scanner.nextInt();

        System.out.println("Qual o valor unitário?");
        precoUnidadeProduto = scanner.nextDouble();

        valorTotalSemDesconto = precoUnidadeProduto * qtdProduto;

        if (qtdProduto <= 5) {
            valorTotalDesconto = valorTotalSemDesconto * 0.02;
            valorTotalPagamento = valorTotalSemDesconto - valorTotalDesconto;
            System.out.println("Você comprou " + qtdProduto + "x" + " " + nomeProduto + ".");
            System.out.println("------------------------------------");
            System.out.println("Valor total da compra: " + valorTotalSemDesconto + ";");
            System.out.println("Valor total de desconto: " + valorTotalDesconto + ";");
            System.out.println("Valor para pagamento: R$" + valorTotalPagamento + ".");

        }

        if (qtdProduto > 5 && qtdProduto <= 10) {
            valorTotalDesconto = valorTotalSemDesconto * 0.03;
            valorTotalPagamento = valorTotalSemDesconto - valorTotalDesconto;
            System.out.println("Você comprou " + qtdProduto + "x" + " " + nomeProduto + ".");
            System.out.println("------------------------------------");
            System.out.println("Valor total da compra: " + valorTotalSemDesconto + ";");
            System.out.println("Valor total de desconto: " + valorTotalDesconto + ";");
            System.out.println("Valor para pagamento: R$" + valorTotalPagamento + ".");

        }

        if (qtdProduto > 10) {
            valorTotalDesconto = valorTotalSemDesconto * 0.05;
            valorTotalPagamento = valorTotalSemDesconto - valorTotalDesconto;
            System.out.println("Você comprou " + qtdProduto + "x" + " " + nomeProduto + ".");
            System.out.println("------------------------------------");
            System.out.println("Valor total da compra: " + valorTotalSemDesconto + ";");
            System.out.println("Valor total de desconto: " + valorTotalDesconto + ";");
            System.out.println("Valor para pagamento: R$" + valorTotalPagamento + ".");

        }

    }

}
