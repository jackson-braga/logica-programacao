package atividades.lista3;

import java.util.Scanner;

/* 2. Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida. Em seguida, mostre-os em ordem crescente e
decrescente.
* */
public class Ex02OrdemCrescenteDecrescente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int A = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int B = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int C = scan.nextInt();

        System.out.printf("Ordem digitada: %d, %d, %d\n", A, B,C);

        if (A < B && A < C) {
            if (B < C) {
                System.out.printf("Ordem crescente: %d, %d, %d\n", A, B,C);
            } else {
                System.out.printf("Ordem crescente: %d, %d, %d\n", A, C,B);
            }
        } else if (B < A && B < C) {
            if (A < C) {
                System.out.printf("Ordem crescente: %d, %d, %d\n", B, A,C);
            } else {
                System.out.printf("Ordem crescente: %d, %d, %d\n", B, C,A);
            }
        } else if (C < A && C < B) {
            if (A < B) {
                System.out.printf("Ordem crescente: %d, %d, %d\n", C, A,B);
            } else {
                System.out.printf("Ordem crescente: %d, %d, %d\n", C, B,A);
            }
        }

        if (A > B && A > C) {
            if (B > C) {
                System.out.printf("Ordem decrescente: %d, %d, %d\n", A, B,C);
            } else {
                System.out.printf("Ordem decrescente: %d, %d, %d\n", A, C,B);
            }
        } else if (B > A && B > C) {
            if (A > C) {
                System.out.printf("Ordem decrescente: %d, %d, %d\n", B, A,C);
            } else {
                System.out.printf("Ordem decrescente: %d, %d, %d\n", B, C,A);
            }
        } else if (C > A && C > B) {
            if (A > B) {
                System.out.printf("Ordem decrescente: %d, %d, %d\n", C, A,B);
            } else {
                System.out.printf("Ordem decrescente: %d, %d, %d\n", C, B,A);
            }
        }
    }
}
