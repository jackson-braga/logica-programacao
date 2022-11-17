package lista1;

import java.util.Scanner;

public class Exercicio7 {
    // As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
    //Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantas maçãs você quer comprar: ");
        int quantidadeMacas = input.nextInt();

        double totalCompra;

        if (quantidadeMacas < 12) {
            totalCompra = quantidadeMacas * 1.30;
        } else {
            totalCompra = quantidadeMacas * 1.00;
        }

        System.out.println("O total da compra é de: R$ " + totalCompra);
    }
}
