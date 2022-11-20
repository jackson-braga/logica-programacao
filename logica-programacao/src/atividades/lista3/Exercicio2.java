package lista3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

    // Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida.
    // Em seguida, mostre-os em ordem crescente e decrescente.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] valores = new int[3];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + (i+1) + ": ");
            valores[i] = input.nextInt();
        }

        System.out.println("Ordem inserida: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            if (i < (valores.length - 1)) {
                System.out.print(", ");
            }
        }

        Arrays.sort(valores);
        System.out.println("\nOrdem crescente: ");

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i]);
            if (i < (valores.length - 1)) {
                System.out.print(", ");
            }
        }

        System.out.println("\nOrdem decrescente: ");

        for (int i = (valores.length -1); i >= 0; i--) {
            System.out.print(valores[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}

