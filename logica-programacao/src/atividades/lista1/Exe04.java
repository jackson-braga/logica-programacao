package atividades.lista1;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        double salarioFixo;
        double totalVendas;
        double salarioTotal;
        double comissao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor fixo do seu sal�rio?");
        salarioFixo = scanner.nextDouble();

        System.out.println("Qual o valor total das suas vendas no m�s?");
        totalVendas = scanner.nextDouble();

        comissao = (totalVendas * 5) / 100;
        salarioTotal = salarioFixo + comissao;

        System.out.println("Seu sal�rio final � de: R$" + salarioTotal);

    }

}
