package atividades.lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, soma = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Medida A:");
        a = scan.nextDouble();
        while (a <= 0) {
            System.out.println("Medida INVÁLIDA:");
            System.out.println("Digite medida A:");
            a = scan.nextDouble();
        }
        System.out.println("Medida B:");
        b = scan.nextDouble();
        while (b <= 0) {
            System.out.println("Medida INVÁLIDA:");
            System.out.println("Digite medida B:");
            b = scan.nextDouble();
        }
        System.out.println("Medida C:");
        c = scan.nextDouble();
        while (c <= 0) {
            System.out.println("Medida INVÁLIDA:");
            System.out.println("Digite medida C:");
            c = scan.nextDouble();
        }
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("É um triângulo");
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
