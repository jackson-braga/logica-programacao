package atividades.lista3;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double valor1 = 0, valor2 = 0, div = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor 1:");
        valor1 = scan.nextDouble();
        System.out.println("Valor 2:");
        valor2 = scan.nextDouble();
        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("Digite Valor 2:");
            valor2 = scan.nextDouble();
        }
        div = valor1 / valor2;
        System.out.println("Valor 1 / Valor 1 = " + div);
    }
}