package atividades.lista3;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Altura do triângulo: ");
        int altura = scan.nextInt();
        String asterisco = "*";

        // Processamento e Saída de Dados
        for (int i = 1; i <= altura; i++) {
            System.out.println(asterisco);
            asterisco = asterisco + "*";
        }
    }
}
