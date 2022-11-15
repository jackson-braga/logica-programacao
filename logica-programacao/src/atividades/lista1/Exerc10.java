package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc10 {
    public static void main(String[] args) {
//        A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora
//        extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa que leia o número de horas
//        trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
//        extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite quantidade de horas trabalhadas no mês.");
        int horasTrabalhadasMes = leitor.nextInt();

        int qtdHoraMensal = 40 * 4;

        double salario = 3000.00;
        double salarioHora = salario / qtdHoraMensal;
        double horaExtra = (salarioHora * 50) / 100 + salarioHora;
        int horaExtramensal = horasTrabalhadasMes - qtdHoraMensal;
        double calcHoraExtra = horaExtramensal * horaExtra;
        double salarioTotal = salario + calcHoraExtra;


        System.out.println(" Seu salário Total é R$ "+ salarioTotal);


    }
}
