package atividades.lista1;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {

        int horasTrabalhadas;
        double salario;
        double valorHora;
        double calcExtra;
        double salarioFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        salario = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês?");
        horasTrabalhadas = scanner.nextInt();

        valorHora = salario / 160;
        calcExtra = valorHora + (valorHora * 0.5);

        if (horasTrabalhadas > 160) {
            salarioFinal = salario + (calcExtra * (horasTrabalhadas - 160));

        } else if (horasTrabalhadas == 160) {
            salarioFinal = salario;

        } else {
            salarioFinal = salario - (valorHora * (160 - horasTrabalhadas));

        }

        System.out.println("Seu salário do mês é: R$" + salarioFinal + ".");

    }

}
