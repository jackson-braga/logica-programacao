package atividades.lista1;

import java.util.Scanner;

public class exercicio_4 {
    //Calcuar o salário com fixo + comissão de 5% do total das vendas

    public static void main(String[] args) {
        double fixo;
        double totalVendas;
        double salario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sue salário fixo: ");
        fixo = scanner.nextDouble();
        System.out.println("Digite o total de vendas do mês: ");
        totalVendas = scanner.nextDouble();

        salario = fixo + ((totalVendas/100)*5);

        System.out.println("O seu salário final é: " + salario);

    }
}
