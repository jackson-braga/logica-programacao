package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 13/11/2022
 */
public class Exerc4 {
    public static void main(String[] args) {
//        Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma
//        comissão, também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas. Escrever um
//        programa que leia o valor total de suas vendas e o salário fixo. Calcule e escreva o salário final do vendedor.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor total das suas vendas");
        double totalVendas = leitor.nextDouble();
        final double salario = 900.00;
        final double comissao = totalVendas / 100 * 5;

        double salarioFinal = salario + comissao;
        System.out.println("Salário total no valor de R$ "+ salarioFinal);
    }
}
