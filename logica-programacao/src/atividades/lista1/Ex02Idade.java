package atividades.lista1;

import java.util.Scanner;

/* 2. Faça um programa que leia a idade de uma pessoa expressa em anos, meses
e dias e escreva a quantidade de dias que essa pessoa já viveu. Considerar ano
com 365 dias e mês com 30 dias.
*/
public class Ex02Idade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" Digite a idade em anos, meses e dias: ");
        int anos = in.nextInt();
        int meses = in.nextInt();
        int dias = in.nextInt();

        int idadeEmDias = (anos*365) + (meses*30) + (dias);

        System.out.printf("Sua idade é %d dias.", idadeEmDias);


    }
}
