package atividades.lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double salario = 0, vendas = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Salário:");
        salario = scan.nextDouble();
        while (salario <= 0) {
            System.out.println("Valor do Salário INVALIDO");
            System.out.println("Salário:");
            salario = scan.nextDouble();
        }
        System.out.println("Total de Vendas:");
        vendas = scan.nextDouble();
        while (salario < 0) {
            System.out.println("Valor do Total de Vendas INVALIDO");
            System.out.println("Total de Vendas:");
            vendas = scan.nextDouble();
        }
        double salario_total = (vendas*0.05)+salario;
        System.out.printf("Salário Total: R$ %.2f%n", salario_total);
    }
}
