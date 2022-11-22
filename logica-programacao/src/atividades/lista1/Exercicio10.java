package atividades.lista1;

import java.util.Scanner;

public class Exercicio10 {
    /**
     * 10. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora
     * extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa que leia o número de horas
     * trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
     * extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int jornadaTotal = 40 * 4;
        System.out.print("Informe o número de horas trabalhadas: ");
        float horasTrabalhadas = scann.nextFloat();
        System.out.print("Informe o valor de hora trabalhada: ");
        float valorHora = scann.nextFloat();
        float salarioFinal;
        if (horasTrabalhadas > jornadaTotal) {
            System.out.println("\nO empregado receberá hora extra, pois sua jornada excedeu 40h semanais.");
            System.out.print("Totais de horas trabalhadas: " + horasTrabalhadas);
            salarioFinal = (horasTrabalhadas * valorHora) + ((valorHora * 0.5f) * horasTrabalhadas);
            System.out.printf("\nO empregado receberá R$: %.2f", salarioFinal);
        } else {
            System.out.println("\nO empregado não receberá hora extra pois sua jornada não excedeu 40h semanais.");
            salarioFinal = horasTrabalhadas * valorHora;
            System.out.printf("O empregado receberá R$: %.2f", salarioFinal);
        }
    }
}
