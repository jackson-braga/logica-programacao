package atividades.lista2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double lado1 = 0, lado2 = 0, lado3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Medida Lado 1:");
        lado1 = scan.nextDouble();
        while (lado1 <= 0) {
            System.out.println("Medida INVÁLIDA!");
            System.out.println("Digite medida do lado 1:");
            lado1 = scan.nextDouble();
        }

        System.out.println("Medida Lado 2:");
        lado2 = scan.nextDouble();
        while (lado2 <= 0) {
            System.out.println("Medida INVÁLIDA!");
            System.out.println("Digite medida do lado 2:");
            lado2 = scan.nextDouble();
        }

        System.out.println("Medida Lado 3:");
        lado3 = scan.nextDouble();
        while (lado3 <= 0) {
            System.out.println("Medida INVÁLIDA!");
            System.out.println("Digite medida do lado 3:");
            lado3 = scan.nextDouble();
        }
        if ((lado1 == lado2) && (lado2 == lado3)) {
            System.out.println("Triângulo Equilátero");
        } else if ((((lado1 == lado2) && (lado2 != lado3)) || ((lado2 == lado3) && (lado2 != lado1))) || ((lado3 == lado1) && (lado1 != lado2))) {
            System.out.println("Triângulo Isócele");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}
