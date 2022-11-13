//      2. Faça um programa que leia a idade de uma pessoa expressa em anos,
//      meses e dias e escreva a quantidade de dias que essa pessoa já viveu.
//      Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println("Quantos ANOS completos você tem?");
        int anos = scann.nextInt();
        System.out.println("Além dos anos, quantos MESES completos você tem?");
        int meses = scann.nextInt();
        System.out.println("Além dos anos e meses, quantos DIAS completos você tem?");
        int dias = scann.nextInt();

        int anosEmDias = anos * 365;
        int mesesEmDias = meses * 30;
        int soma = anosEmDias + mesesEmDias + dias;

        System.out.println("Você já viveu " + soma + " dias em toda sua vida!");
    }
}
