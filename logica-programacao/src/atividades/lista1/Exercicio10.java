package atividades.lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        double horasMes = sc.nextDouble();
        System.out.print("Entre com o valor por horas: ");
        double salarioHora = sc.nextDouble();
        double jornada = 160;
        double horaExtra = horasMes - jornada;
        double valorHoraExtra = (horaExtra + horaExtra * 0.50) * salarioHora;
        double salarioTotal;

        if(horasMes <= jornada) {
            salarioTotal =  salarioHora * jornada;
        } else {
            salarioTotal = (salarioHora * horasMes) + valorHoraExtra;
        }

        System.out.printf("Salário total no mes: R$%.2f" , salarioTotal);


        sc.close();
    }
}
