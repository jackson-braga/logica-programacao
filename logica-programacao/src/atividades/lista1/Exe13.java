package atividades.lista1;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {

        int litros;
        double valorTotalDesconto;
        double valorTotalSemDesconto;
        double valorFinalPagamento;
        String combustivel;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos litros de combust�vel voc� comprou?");
        litros = scanner.nextInt();

        System.out.println("Qual combust�vel voc� comprou? Digite 'A' para �lcool e 'G' para Gasolina:");
        combustivel = scanner.next();

        if (combustivel.equalsIgnoreCase("A")) {

            valorTotalSemDesconto = litros * 3.69;

            if (litros > 20) {
                valorTotalDesconto = (3.69 * 0.05) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Voc� comprou �lcool. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

            if (litros <= 20) {
                valorTotalDesconto = (3.69 * 0.02) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Voc� comprou �lcool. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

        } else if (combustivel.equalsIgnoreCase("G")) {

            valorTotalSemDesconto = litros * 4.79;

            if (litros > 20) {
                valorTotalDesconto = (4.79 * 0.06) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Voc� comprou Gasolina. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

            if (litros <= 20) {
                valorTotalDesconto = (4.79 * 0.03) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Voc� comprou Gasolina. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

        } else {
            System.out.println("Valor inv�lido!");

        }

    }

}
