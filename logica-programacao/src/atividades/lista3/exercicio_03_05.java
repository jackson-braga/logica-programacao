//  5. Faça um programa que recebe a altura de um triângulo em
//  um número inteiro e imprima-o utilizando asteriscos. Veja o
//  Exemplo:
//  Entrada: 5
//  *
//  **
//  ***
//  ****
//  *****

import java.util.Scanner;

public class exercicio_03_05 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Qual a altura do triângulo? ");
        int altura = scann.nextInt();

        for (int i = 1; i <= altura; i++) {
            System.out.println("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }

    }
}

// Está imprimindo com uma linha a mais, repetindo a última linha, e não sei dizer o motivo
