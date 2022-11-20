package lista3;

import java.util.Scanner;

public class Exercicio5 {
    // Faça um programa que recebe a altura de um triângulo em um número inteiro e imprima-o
    // utilizando asteriscos.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a altura do triângulo: ");
        int alturaTriangulo = input.nextInt();

        for (int i = 1; i <= alturaTriangulo; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
