package atividades.lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double salario = 0, salarioTotal = 0, horas = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Horas Trabalhadas:");
        horas = scan.nextDouble();
        while (horas < 0) {
            System.out.println("Número de Horas trabalhadas INVÁLIDO:");
            System.out.println("Digite o número de horas trabalhadas:");
            horas = scan.nextDouble();
        }
        System.out.println("Salário por Hora:");
        salario = scan.nextDouble();
        while (salario < 0) {
            System.out.println("Valor do salário por hora INVÁLIDO:");
            System.out.println("Digite o valor do salario por horas:");
            salario = scan.nextDouble();
        }
        if (horas == 160) {
            salarioTotal = salario * horas;
        } else if (horas > 160) {
            double extra = horas - 160;
            salarioTotal = ((salario * 160) + ((salario * 1.5) * extra));
        } else {
            System.out.println("Funcionário Negativado" + horas);
        }
        System.out.printf("Total do Salário:R$ %.2f", salarioTotal);

    }
}