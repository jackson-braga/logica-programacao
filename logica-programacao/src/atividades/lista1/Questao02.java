package lista1;
//      2. Faça um programa que leia a idade de uma pessoa expressa em anos, meses
//      e dias e escreva a quantidade de dias que essa pessoa já viveu.
//      Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        //      Criar variáveis dos anos, meses e dias e receber os
        //      valores do usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os dados de sua idade em anos, meses e dias.");
        System.out.println("Quantos anos completos de idade você tem?");
        int anos = scan.nextInt();
        System.out.println("Quantos meses completos de idade você tem?");
        int meses = scan.nextInt();
        System.out.println("Quantos dias completos de idade você tem?");
        int dias = scan.nextInt();

        //      Converter os anos completos em dias
        int anosEmDias = anos * 365;
        //      Converter os meses completos em dias
        int mesesEmDias = meses * 30;
        //      Somar os dias dos anos, meses e dias em uma nova variável
        //      de total de dias vividos e exibir
        int totalDiasVividos = anosEmDias + mesesEmDias + dias;
        System.out.println("Você já viveu " + totalDiasVividos + " dias.");
    }
}
