package atividades.lista2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os três valores dos lados de triângulo:");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();

        if (l1 == l2 && l1 == l3 && l2 == l3) {
            System.out.println("O triângulo é Equilátero.");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("O triângulo é Isóscele.");
        } else {
            System.out.println("O triângulo é Escaleno.");
        }

        sc.close();
    }
}
