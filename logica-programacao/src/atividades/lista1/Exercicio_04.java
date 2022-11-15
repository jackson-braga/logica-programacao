package atividades.lista1;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Programa que informa salário final de um vendedor, com base no salário fixo e comissão.");
        System.out.println("Informe o valor do salário fixo do vendedor em reais: ");
        double salarioFixo = scan.nextDouble();
        System.out.println("Informe o valor total obtido pelo vendedor no mês em reais: ");
        double totalDeVendas = scan.nextDouble();

        //Processamento de Dados
        double comissao = totalDeVendas * 0.05;
        double salarioTotal = salarioFixo + comissao;

        //Saída de Dados
        System.out.println("O salário final do vendedor é de R$ " + salarioTotal + ".");
    }
}
