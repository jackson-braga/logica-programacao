package atividades.lista1;

import java.util.Scanner;

public class exercicio_12 {
    //Ler os lados e mostras se forma um triângulo
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado A: ");
        a = scanner.nextDouble();
        System.out.println("Digite o valor do lado B: ");
        b = scanner.nextDouble();
        System.out.println("Digite o valor do lado C: ");
        c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Essas dimensões formam um triângulo!");
        }else {
            System.out.println("Essas dimensões não formam um triângulo!");
        }
    }
}
