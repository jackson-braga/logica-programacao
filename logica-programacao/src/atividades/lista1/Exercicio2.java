package lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    // Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e
    // escreva a quantidade de dias que essa pessoa já viveu. Considerar ano com 365 dias
    // e mês com 30 dias.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a sua idade: ");

        System.out.println("Anos: ");
        Short idadeAnos = input.nextShort();

        System.out.println("Meses: ");
        Short idadeMeses = input.nextShort();

        System.out.println("Dias: ");
        Short idadeDias = input.nextShort();

        int diasAno = 365;
        int diasMes = 30;

        System.out.println("Você já viveu " + (idadeAnos*diasAno+idadeMeses*diasMes+idadeDias) + " dias");
    }
}
