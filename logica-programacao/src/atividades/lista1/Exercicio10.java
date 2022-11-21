package atividades.lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //10. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora
        //extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa que leia o número de horas
        //trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
        //extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe o número de horas trabalhadas.");
        int horasTrabalhadasMes = scann.nextInt();

        System.out.println("Informe o valor da hora trabalhada.");
        int valorHoraTrabalho =  scann.nextInt();

        double valorHorasExtras = valorHoraTrabalho * 1.5;
        double salario = horasTrabalhadasMes * valorHoraTrabalho;

        if((horasTrabalhadasMes - 160) > 0){
            double horasExtras = (horasTrabalhadasMes - 160) * valorHorasExtras;
            double result = salario + horasExtras;
            System.out.println("O salário do funcionário é "+ result +".");

        }else {
            System.out.println("O salário do funcionário é "+ salario + ".");
        }
    }
}
