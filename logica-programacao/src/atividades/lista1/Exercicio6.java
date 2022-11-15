package atividades.lista1;

import java.util.Scanner;

public class Exercicio6 {
    /**
     * Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considere que a média é
     * ponderada e que o peso das notas é 2, 3 e 5.
     * Fórmula para o cálculo da média final é:
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a primeira nota do aluno: ");
        float nUm = scann.nextFloat();
        System.out.print("Informe a segunda nota do aluno: ");
        float nDois = scann.nextFloat();
        System.out.print("Informe a terceira nota do aluno: ");
        float nTres = scann.nextFloat();
        float mediaFinal = ((nUm*2)+(nDois*3)+(nTres)*5)/(2+3+5);
        System.out.printf("\nA média final ponderada do aluno é: %.2f",mediaFinal);
    }
}
