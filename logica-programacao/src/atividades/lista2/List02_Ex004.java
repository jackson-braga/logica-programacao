package atividades.lista2;

import java.util.Scanner;

public class List02_Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro ângulo em graus do tirângulo: ");
        float angulo1 = scan.nextFloat();
        System.out.println("Digite o segundo ângulo em graus tirângulo: ");
        float angulo2 = scan.nextFloat();
        System.out.println("Digite o terceiro ângulo em graus tirângulo: ");
        float angulo3 = scan.nextFloat();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (angulo1 > 90 && angulo2 > 90 && angulo3 > 90) {
            System.out.println("Triângulo Acutângulo");
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Ângulo não se enquadra ao triângulo");
        }
    }
}