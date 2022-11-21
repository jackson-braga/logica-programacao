package atividades.lista1;

import java.util.Scanner;

/* 10. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o
salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).
* */
public class Ex10SalarioHoraExtra {

    public static void main(String[] args) {

        int horasTrabalhadas, horasExtras;
        double salarioHora, salarioTotal;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = in.nextInt();
        System.out.print("Digite o salario em horas: ");
        salarioHora = in.nextDouble();

        if (horasTrabalhadas <= 40){
            salarioTotal = horasTrabalhadas * salarioHora;
        }
        else {
            horasExtras = horasTrabalhadas - 40;
            salarioTotal = (40 * salarioHora) + (horasExtras * (salarioHora * 1.5));
        }

        System.out.printf("O salário total do funcionário é R$%.2f.\n", salarioTotal);


    }
}
