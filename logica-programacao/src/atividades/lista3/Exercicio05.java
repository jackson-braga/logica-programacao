package atividades.lista3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de Linhas:");
        while (n <= 0) {
            System.out.println("VALOR INVÁLIDO!");
            System.out.println("Digite N:");
            n = scan.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for(int j=0; j<i;j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
