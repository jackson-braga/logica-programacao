/* Lista de Exercícios 1
Exercício 4:
Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão,
também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas. Escrever um programa que leia o valor
total de vendas e o salário fixo. Calcule e escreva o salário final do vendedor.
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário fixo: ");
        double salarioFixo = scan.nextDouble();
        System.out.println("Informe o valor total de vendas efetuadas: ");
        double valorTotalVendas = scan.nextDouble();
        double comissaoVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoVendas;
        System.out.println("O salário final do vendedor é " + salarioFinal);
    }
}

