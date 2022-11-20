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

        System.out.println("Quantos litros de combustível você comprou?");
        litros = scanner.nextInt();

        System.out.println("Qual combustível você comprou? Digite 'A' para Álcool e 'G' para Gasolina:");
        combustivel = scanner.next();

        if (combustivel.equalsIgnoreCase("A")) {

            valorTotalSemDesconto = litros * 3.69;

            if (litros > 20) {
                valorTotalDesconto = (3.69 * 0.05) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Você comprou Álcool. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

            if (litros <= 20) {
                valorTotalDesconto = (3.69 * 0.02) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Você comprou Álcool. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

        } else if (combustivel.equalsIgnoreCase("G")) {

            valorTotalSemDesconto = litros * 4.79;

            if (litros > 20) {
                valorTotalDesconto = (4.79 * 0.06) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Você comprou Gasolina. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

            if (litros <= 20) {
                valorTotalDesconto = (4.79 * 0.03) * litros;
                valorFinalPagamento = valorTotalSemDesconto - valorTotalDesconto;
                System.out.println("Você comprou Gasolina. Valor a ser pago: R$" + valorFinalPagamento + "!");

            }

        } else {
            System.out.println("Valor inválido!");

        }

    }

}
