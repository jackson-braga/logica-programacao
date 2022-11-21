package atividades.lista3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int idade = 0, cont = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Idade:");
            idade = scan.nextInt();
            while (idade <= 0) {
                System.out.println("Idade INVÁLIDA!");
                System.out.println("Digite Idade:");
                idade = scan.nextInt();
            }
            if (idade >= 18) {
                cont++;
            }
        }

        System.out.println("Idade Maior ou Igual a 18 anos:" + cont);
    }
}
