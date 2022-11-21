package lista3;

//      Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida.
//      Em seguida, mostre-os em ordem crescente e decrescente.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        // Criar variáveis e receber valores do usuário.
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("Informe o terceiro número: ");
        int n3 = scan.nextInt();

        // Exibir os números na ordem digitada:
        System.out.println("Esses são os números na ordem em que foram digitados: " + n1 + ", " + n2 + " e " + n3 + ".");

        // Ordenar numeros por valores e exibir


        if (n1 <= n2 && n2 <= n3) {
            System.out.println("A ordem crescente dos números digitados é: " + n1 + ", " + n2 + " e " + n3 + ".");
            System.out.println("A ordem decrescente dos números digitados é: " + n3 + ", " + n2 + " e " + n1 + ".");
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.println("A ordem crescente dos números digitados é: " + n1 + ", " + n3 + " e " + n2 + ".");
            System.out.println("A ordem decrescente dos números digitados é: " + n2 + ", " + n3 + " e " + n1 + ".");
        } else if (n2 <= n3 && n3 <= n1) {
            System.out.println("A ordem crescente dos números digitados é: " + n2 + ", " + n3 + " e " + n1 + ".");
            System.out.println("A ordem decrescente dos números digitados é: " + n1 + ", " + n3 + " e " + n2 + ".");
        } else if (n2 <= n1 && n1 <= n3) {
            System.out.println("A ordem crescente dos números digitados é: " + n2 + ", " + n1 + " e " + n3 + ".");
            System.out.println("A ordem decrescente dos números digitados é: " + n3 + ", " + n1 + " e " + n2 + ".");
        } else if (n3 <= n1 && n1 <= n2) {
            System.out.println("A ordem crescente dos números digitados é: " + n3 + ", " + n1 + " e " + n2 + ".");
            System.out.println("A ordem decrescente dos números digitados é: " + n2 + ", " + n1 + " e " + n3 + ".");
        } else if (n3 <= n2 && n2 <= n3) {
            System.out.println("A ordem crescente dos números digitados é: " + n3 + ", " + n2 + " e " + n1 + ".");
            System.out.println("A ordem decrescente dos números digitados é: " + n1 + ", " + n2 + " e " + n3 + ".");
        }
    }
}
