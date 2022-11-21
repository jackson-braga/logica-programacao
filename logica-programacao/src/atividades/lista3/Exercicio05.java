package atividades.lista3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a altura do Triângulo: ");
        int linhas = sc.nextInt();
        int contA;
        int contB;

        for (contA = 1; contA <= linhas; contA++) {

            for (contB = linhas; contB >= contA; contB--)
                System.out.print("*");
            System.out.print("\n");// quebra linha
        }


        sc.close();
    }
}
