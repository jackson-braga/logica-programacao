package atividades.lista1;

import java.util.Scanner;

public class Exercicio7 {
    /**
     * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
     * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        float vendaFinal;
        System.out.print("Informe quantas unidades de maçã foram vendidas: ");
        int maca = scann.nextInt();
        if (maca < 12) {
            vendaFinal = maca * 1.3f;
        } else {
            vendaFinal = maca * 1f;
        }
        System.out.printf("Foram vendidas " + maca + " maçãs.");
        System.out.printf("O valor total da compra foi de R$: %.2f", vendaFinal);
    }
}