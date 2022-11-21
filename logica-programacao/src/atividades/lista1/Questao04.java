package lista1;

//      4. Uma revendedora de carros usados paga a seus funcionários vendedores
//      um salário fixo por mês, mais uma comissão, também fixa, para cada carro
//      vendido de 5% do valor das vendas por ele efetuadas. Escrever um
//      programa que leia o valor total de suas vendas e o salário fixo.
//      Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        //      Criar variáveis e receber valores do salário fixo e do total das vendas
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário fixo do vendedor:");
        float salarioFixo = scan.nextFloat();
        System.out.println("Informe o valor total das vendas:");
        float totalVendas = scan.nextFloat();

        // Calcular comissão e salvar em uma variável para exibição posterior

        double comissao = totalVendas * 0.05;
        double salarioFinal = salarioFixo + comissao;

        // Calcular e exibir salário final
        System.out.printf("O salário final do vendedor é : R$ %.2f", salarioFinal);
    }
}
