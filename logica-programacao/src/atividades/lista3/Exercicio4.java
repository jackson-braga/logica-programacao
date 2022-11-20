package lista3;

import java.util.Scanner;

public class Exercicio4 {
    // Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
    // a. A quantidade de pessoas em cada faixa etária;
    // b. A percentagem de pessoas nas faixas etárias, com relação ao total de pessoas:
    // ● Até 15 anos
    // ● De 16 a 30 anos
    // ● De 31 a 45 anos
    // ● De 46 a 60 anos
    // ● Acima de 61 anos

    public static void main(String[] args) {

        int [] idades = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade: ");
            idades[i] = input.nextInt();
        }
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i]);
            if (i < (idades.length - 1)) {
                System.out.print(", ");
            }
        }
    }
}
