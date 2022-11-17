package lista1;

import java.util.Scanner;

public class Exercicio10 {
    // A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
    // de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
    // Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
    // o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
    // (considere que o mês possua 4 semanas exatas).

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Horas trabalhadas no mês: ");
        double horasTrabalhadasMes = input.nextDouble();

        System.out.println("Valor do salário por hora: ");
        double valorSalarioHora = input.nextDouble();

        double valorHoraExtra = (valorSalarioHora + (valorSalarioHora * 0.50));

        if (horasTrabalhadasMes > 160) {
            double salarioTotal = (horasTrabalhadasMes*valorSalarioHora) + valorHoraExtra;
            System.out.println("O salário total do funcionário é: " + salarioTotal);
        } else {
            double salarioTotal = horasTrabalhadasMes*valorSalarioHora;
            System.out.println("O salário total do funcionário é: " + salarioTotal);
        }
    }
}
