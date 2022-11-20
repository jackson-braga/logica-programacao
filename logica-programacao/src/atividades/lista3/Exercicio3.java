package lista3;

import java.util.Scanner;

public class Exercicio3 {

    // Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de
    // pessoas com idade maior ou igual a 18 anos.

    public static void main(String[] args) {

        int [] idades = new int[10];
        int contadorMaiores = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade: ");
            idades[i] = input.nextInt();
        }
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i]);
            if (i < (idades.length - 1)) {
                System.out.print(", ");
            }
            if (idades[i] >= 18) {
                contadorMaiores++;
            }
        }
        System.out.println("\nQuantidade de pessoas com idade maior ou igual a 18: " + contadorMaiores);
    }
}
