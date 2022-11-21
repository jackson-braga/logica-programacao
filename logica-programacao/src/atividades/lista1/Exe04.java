package atividades.lista1;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        double salarioFixo;
        int qtdCarrosVendidos;
        double comissao;
        double salarioTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor fixo do seu salário?");
        salarioFixo = scanner.nextDouble();

        System.out.println("Quantos carros você vendeu este mês?");
        qtdCarrosVendidos = scanner.nextInt();

        double comissaoTotal = 0;
        if (qtdCarrosVendidos == 0) {
            comissaoTotal = 0;
            salarioTotal = salarioFixo;

        } else {

            System.out.println("Informe o valor de cada carro vendido:");

            for (int index = 1; index <= qtdCarrosVendidos; index++) {
                double valorCarro = scanner.nextDouble();
                comissao = valorCarro * 0.05;
                System.out.println("A comissão para esta venda é de: R$" + comissao +"!");

                comissaoTotal = comissaoTotal + comissao;

            };

            salarioTotal = salarioFixo + comissaoTotal;

        }

        System.out.println("Seu salário final é de: R$" + salarioTotal + "!");

    }

}
