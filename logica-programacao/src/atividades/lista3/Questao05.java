package lista3;
//      Faça um programa que recebe a altura de um triangulo em um numero inteiro e imprima-o utilizando asteriscos.

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        // Criar variável e receber altura da pirâmide do usuário.
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a altura da pirâmide: ");
        int altura = scan.nextInt();

        int base = 1;

        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < base; j++) {
                System.out.printf("*");
            }
            System.out.println();
            base++;
        }
    }
}
