package atividades.lista2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double angulo1 = 0, angulo2 = 0, angulo3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ângulo 1:");
        angulo1 = scan.nextDouble();
        while (angulo1 <= 0) {
            System.out.println("Medida INVÁLIDA!");
            System.out.println("Digite medida do Angulo 1:");
            angulo1 = scan.nextDouble();
        }

        System.out.println("Ângulo 2:");
        angulo2 = scan.nextDouble();
        while (angulo2 <= 0) {
            System.out.println("Medida INVÁLIDA!");
            System.out.println("Digite medida do Angulo 2:");
            angulo2 = scan.nextDouble();
        }

        System.out.println("Ângulo 3:");
        angulo3 = scan.nextDouble();
        while (angulo3 <= 0) {
            System.out.println("Medida INVÁLIDA!");
            System.out.println("Digite medida do Angulo 3:");
            angulo1 = scan.nextDouble();
        }

        if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
            System.out.println("Triângulo Retângulo!");
        }
        else if (((angulo1 > 90) && (angulo2 < 90) && (angulo3 < 90)) || ((angulo2 > 90) && (angulo3 < 90) && (angulo1 < 90)) || ((angulo3 > 90) && (angulo2 < 90) && (angulo1 < 90))){
            System.out.println("Triângulo Obtusângulo!");
        }
        else if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)){
            System.out.println("Triângulo Acutângulo!");
        }
    }
}