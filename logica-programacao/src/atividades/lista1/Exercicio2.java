package atividades.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        //2. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a quantidade de dias que
        //essa pessoa já viveu. Considerar ano com 365 dias e mês com 30 dias.

        Scanner scann = new Scanner(System.in);

        System.out.println("Informe o número de anos.");
        int anos = scann.nextInt();

        System.out.println("Informe o número de meses.");
        int meses = scann.nextInt();

        System.out.println("Informe o número de dias.");
        int dias = scann.nextInt();

        int totalDeDias = dias + (meses*30) + (anos*365);

        System.out.println("Foram " +totalDeDias + " vividos.");

    }
}
