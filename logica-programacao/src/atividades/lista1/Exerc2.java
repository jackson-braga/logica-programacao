package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 13/11/2022
 */
public class Exerc2 {
    public static void main(String[] args) {
//        Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a
//        quantidade de dias que essa pessoa já viveu. Considerar ano com 365 dias e mês com 30 dias.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite  idade!");
        int idade = leitor.nextInt();
        System.out.println("Digite mes!");
        int mes = leitor.nextInt();
        System.out.println("Digite dia!");
        int dia = leitor.nextInt();

        int idades = 365 * idade;
        int meses = 30 * mes;
        int dias = idades + meses + dia;
        System.out.println("Sua idade em dias é  " + dias);

    }
}
