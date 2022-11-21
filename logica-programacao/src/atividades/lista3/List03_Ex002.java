package atividades.lista3;

import java.util.Scanner;

public class List03_Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = scan.nextInt();

        System.out.println("Ordem digitada: " + n1 + " " + n2 + " " + n3);

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println("Ordem crescente: " + n1 + " " + n2 + " " + n3);
            } else if (n3 < n2) {
                System.out.println("Ordem crescente: " + n1 + " " + n3 + " " + n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println("Ordem crescente: " + n2 + " " + n1 + " " + n3);
            } else if (n3 < n1) {
                System.out.println("Ordem crescente: " + n2 + " " + n3 + " " + n1);
            }
        } else if (n3 < n1 && n3 < n2) {
            if (n1 < n2) {
                System.out.println("Ordem crescente: " + n3 + " " + n1 + " " + n2);
            } else if (n2 < n1) {
                System.out.println("Ordem crescente: " + n3 + " " + n2 + " " + n1);
            }
        }

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.println("Ordem decrescente: " + n1 + " " + n2 + " " + n3);
            } else if (n3 > n2) {
                System.out.println("Ordem decrescente: " + n1 + " " + n3 + " " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("Ordem decrescente: " + n2 + " " + n1 + " " + n3);
            } else if (n3 > n1) {
                System.out.println("Ordem decrescente: " + n2 + " " + n3 + " " + n1);
            }
        } else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println("Ordem decrescente: " + n3 + " " + n1 + " " + n2);
            } else if (n2 > n1) {
                System.out.println("Ordem decrescente: " + n3 + " " + n2 + " " + n1);
            }
        }
    }
}
