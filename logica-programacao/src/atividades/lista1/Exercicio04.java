package atividades.lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o sálario do vendedor: ");
        double salarioFixo = sc.nextDouble();
        System.out.print("Entre com o valor total vendido de carros no mês: ");
        double valorTotalVendas = sc.nextDouble();

        double comissao = valorTotalVendas * 0.05;
        double salarioTotal = salarioFixo + comissao;

        System.out.print("Salário total no mês foi R$" + salarioTotal);


        sc.close();
    }
}
