package lista1;

import java.util.Scanner;

public class Exercicio4 {
    // Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
    // mais uma comissão,também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas.
    // Escrever um programa que leia o valor total de suas vendas e o salário fixo.
    // Calcule e escreva o salário final do vendedor.

    public static void main(String[] args) {

        final double comissao = 0.05;
        double salarioFixo;
        double totalVendas;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o seu salário mensal fixo: ");
        salarioFixo = input.nextDouble();

        System.out.println("Informe o total de vendas do mês: ");
        totalVendas = input.nextDouble();

        double salarioFinal = salarioFixo + 0.05 * totalVendas;
        System.out.println("O salário final do vendedor é: " + salarioFinal);

    }
}
