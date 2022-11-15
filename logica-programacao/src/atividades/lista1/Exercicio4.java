package atividades.lista1;

import java.util.Scanner;

public class Exercicio4 {
    /**
     4. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão,
     também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas. Escrever um programa que leia o valor
     total de suas vendas e o salário fixo. Calcule e escreva o salário final do vendedor.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe o valor total de vendas do empregado: ");
        float tVendas = scann.nextFloat();
        System.out.print("Informe o número de carros vendidos: ");
        float veiculosVendidos = scann.nextFloat();
        System.out.print("Informe o salário fixo do empregado: R$ ");
        float salario = scann.nextFloat();
        float comissao = tVendas * 0.05f;
        float salarioFinal = salario + (veiculosVendidos * comissao);
        System.out.printf("O salário final do empregado com comissão é de: R$ %.2f",salarioFinal);
    }
}
