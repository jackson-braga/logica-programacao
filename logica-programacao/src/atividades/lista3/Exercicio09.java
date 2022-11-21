package atividades.lista3;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("N:");
        while (n <= 0) {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("Digite N:");
            n = scan.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
