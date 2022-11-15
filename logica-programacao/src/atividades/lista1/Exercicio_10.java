package atividades.lista1;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que calcula o valor pago por horas trabalhadas e horas extras");
        System.out.println("Digite o valor do salário em reais:");
        double salario = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        //Processamento de Dados
        double horasNoMes = 160;
        double valorHoraTrabalho = salario / horasNoMes;
        double valorHoraExtraMes = valorHoraTrabalho * 1.5;
        double salarioMes = Math.round(salario + ((horasTrabalhadas % horasNoMes) * valorHoraExtraMes));

        //Saída de Dados
        System.out.println("O valor a ser pago no mês é de R$ " + salarioMes + ".");
    }
}
