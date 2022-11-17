package atividades.lista1;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double n1 = 0, n2 = 0, media = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Avaliação 1:");
        n1 = scan.nextInt();
        System.out.println("Avaliação 2:");
        n2 = scan.nextInt();
        media = (n1 + n2) / 2;
        if (media >= 6) {
            System.out.println("Média:" + media + " APROVADO");
        } else {
            System.out.println("Média:" + media + " REPROVADO");
        }
    }
}
