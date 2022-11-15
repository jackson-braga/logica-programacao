package atividades.lista1;

import java.time.Year;
import java.util.Scanner;

public class Exercicio2 {
    /**
     * 2. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a quantidade de dias que
     * essa pessoa já viveu. Considerar ano com 365 dias e mês com 30 dias.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int dia, mes, ano, quantidadeDias;
        //data atual
        int anoAtual = Year.now().getValue();
        System.out.println("Insira a data de nascimento");
        System.out.print("Dia: ");
        dia = scann.nextInt();
        System.out.print("Mês: ");
        mes = scann.nextInt();
        System.out.print("Ano: ");
        ano = scann.nextInt();
        //calculo
        quantidadeDias = ((anoAtual - ano) * 365) + (mes * 30) + dia;
        System.out.println("A pessoa já viveu: " + quantidadeDias + " dias");
    }
}
