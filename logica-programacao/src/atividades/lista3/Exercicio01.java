package atividades.lista3;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int vet[] = new int[2001];

        for (int i = 1000; i <= 2000; i++) {
            if (i % 11 == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
