//  7. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00
//  se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs
//  compradas, calcule e escreva o custo total da compra.

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Quantas maçãs vc quer comprar? ");
        int qtdMacas = scann.nextInt();
        double valorMacas;

        if (qtdMacas >= 12) {
            valorMacas = 1.00;
        } else {
            valorMacas = 1.30;
        }

        System.out.println("O custo de sua compra será de R$ " + (qtdMacas * valorMacas));
    }
}
