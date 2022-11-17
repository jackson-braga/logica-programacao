package atividades.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o salário do funcionário: ");
        float salarioFuncionario = scan.nextFloat();
        System.out.println("Qual valor total vendido neste mês: ");
        float carrosVendidos = scan.nextFloat();
        float comissao = (carrosVendidos * 5) / 100;
        float salarioTotal = salarioFuncionario + comissao;

        System.out.println("Salário do Funcionário: " + new DecimalFormat(".##").format(salarioFuncionario));
        System.out.println("Valor total vendido no mês: " + new DecimalFormat(".##").format(carrosVendidos));
        System.out.println("Valor total da comissão: " + new DecimalFormat(".##").format(comissao));
        System.out.println("Valor total do Salário com comissão do mês: " + new DecimalFormat(".##").format(salarioTotal));

    }
}
