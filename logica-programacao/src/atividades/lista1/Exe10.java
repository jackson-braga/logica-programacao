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

        System.out.println("Qual o seu sal�rio?");
        salario = scanner.nextDouble();

        System.out.println("Quantas horas voc� trabalhou esse m�s?");
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

        System.out.println("Seu sal�rio do m�s �: R$" + salarioFinal + ".");

    }

}
