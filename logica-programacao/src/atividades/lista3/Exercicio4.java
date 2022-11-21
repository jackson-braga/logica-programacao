package atividades.lista3;

import java.util.Scanner;

public class Exercicio4 {
    /**
     * Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
     * a. A quantidade de pessoas em cada faixa etária;
     * b. A percentagem de pessoas nas faixa etária, com relação ao total de pessoas:
     * ● Até 15 anos
     * ● De 16 a 30 anos
     * ● De 31 a 45 anos
     * ● De 46 a 60 anos
     * ● Acima de 61 anos
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Insira a " + (i + 1) + "º idade: ");
            idades[i] = scann.nextInt();
        }
        //até 15
        int quinze = 0, trinta = 0, quarentaCinco = 0, sessenta = 0, sessentaUm = 0;
        for (int idade : idades) {
            if (idade <= 15) quinze++;
            if (idade >= 16 && idade <= 30) trinta++;
            if (idade >= 31 && idade <= 45) quarentaCinco++;
            if (idade >= 46 && idade <= 60) sessenta++;
            if (idade >= 61) sessentaUm++;

        }
        //15 menos
        System.out.println("------Faixa etária------\n● Até 15 anos");
        System.out.println(quinze + " pessoas até 15 anos.");
        //16 a 30
        System.out.println("\n------------------------------------------------");
        System.out.println("● De 16 a 30 anos");
        System.out.println(trinta + " pessoas de 16 a 30 anos.");
        //31 a 45
        System.out.println("\n------------------------------------------------");
        System.out.println("● De 31 a 45 anos");
        System.out.println(quarentaCinco + " pessoas de 31 a 45 anos.");
        //46 a 60
        System.out.println("\n------------------------------------------------");
        System.out.println("● De 46 a 60 anos");
        System.out.println(sessenta + " pessoas de 46 a 60 anos.");
        //61 acima
        System.out.println("\n------------------------------------------------");
        System.out.println("● Acima de 61 anos");
        System.out.println(sessentaUm + " pessoas acima de 61 anos.");
    }

}
