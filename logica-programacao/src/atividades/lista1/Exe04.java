package atividades.lista1;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        double salarioFixo;
        double totalVendas;
        double salarioTotal;
        double comissao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor fixo do seu salário?");
        salarioFixo = scanner.nextDouble();

        System.out.println("Qual o valor total das suas vendas no mês?");
        totalVendas = scanner.nextDouble();

        comissao = (totalVendas * 5) / 100;
        salarioTotal = salarioFixo + comissao;

        System.out.println("Seu salário final é de: R$" + salarioTotal);

    }

}
