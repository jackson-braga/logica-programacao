//  4. Uma revendedora de carros usados paga a seus funcionários vendedores um salário
//  fixo por mês, mais uma comissão, também fixa, para cada carro vendido de 5% do valor
//  das vendas por ele efetuadas. Escrever um programa que leia o valor total de suas
//  vendas e o salário fixo. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class exercicio_01_04 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Qual foi a quantidade total de suas vendas este mês?");
        double vendasMes = scann.nextDouble();
        System.out.println("Qual é seu salário base?");
        double salarioBase = scann.nextDouble();
        double comissao = vendasMes * 0.05;

        System.out.println("Você será agraciado com a comissão mensal de R$ " + comissao + " e o valor a ser recebido este mês, será de R$ " + (salarioBase + comissao));
    }
}
