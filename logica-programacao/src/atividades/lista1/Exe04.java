package atividades.lista1;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        double salarioFixo;
        int qtdCarrosVendidos;
        double comissao;
        double salarioTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor fixo do seu sal�rio?");
        salarioFixo = scanner.nextDouble();

        System.out.println("Quantos carros voc� vendeu este m�s?");
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
                System.out.println("A comiss�o para esta venda � de: R$" + comissao +"!");

                comissaoTotal = comissaoTotal + comissao;

            };

            salarioTotal = salarioFixo + comissaoTotal;

        }

        System.out.println("Seu sal�rio final � de: R$" + salarioTotal + "!");

    }

}
