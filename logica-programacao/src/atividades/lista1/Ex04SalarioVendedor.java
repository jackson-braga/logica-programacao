package atividades.lista1;

/* 4. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão,
também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas. Escrever um programa que leia o valor
total de suas vendas e o salário fixo. Calcule e escreva o salário final do vendedor.
* */

import java.util.Scanner;

public class Ex04SalarioVendedor {

    public static void main(String[] args) {

        double totalVendas, salario, salarioFinal;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o total de Vendas do Vendedor: ");
        totalVendas = in.nextDouble();
        System.out.println("Digite o salário do Vendedor: ");
        salario = in.nextDouble();

        salarioFinal = salario + totalVendas * 0.05;

        System.out.printf("O salário final do Vendedor é R$%.2f.\n", salarioFinal);

    }
}
