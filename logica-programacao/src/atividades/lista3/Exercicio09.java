package atividades.lista3;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro maior que 0: ");
        int n = sc.nextInt();
        int vet[] = new int[n];

        if (n > 0) {

            for (int i = 0; i < n; i++) {
                System.out.print("Digite os numeros inteiros sem casa decimal: ");
                vet[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Digite os numeros inteiros sem casa decimal: " + vet[i]);

            }

        } else {
            System.out.println("Valor invalido digite outro numero novamente.");

        }


        sc.close();
    }
}
