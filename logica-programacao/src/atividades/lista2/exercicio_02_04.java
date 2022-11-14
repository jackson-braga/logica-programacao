//  4. Escreva um programa que leia o valor de 3 ângulos de um
//  triângulo e escreva se o triângulo é Acutângulo, Retângulo ou
//  Obtusângulo. Sendo que:
//  Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
//  Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
//  Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)

import java.util.Scanner;

public class exercicio_02_04 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite o primeiro ângulo de seu triângulo: ");
        int angulo1 = scann.nextInt();
        System.out.println("Digite o segundo ângulo de seu triângulo: ");
        int angulo2 = scann.nextInt();
        int angulo3 = 180 - (angulo1 + angulo2);

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Seu triângulo é um TRIÂNGULO RETÂNGULO");
        } else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            System.out.println("Seu triângulo é um TRIÂNGULO ACUTÂNGULO");
        } else {
            System.out.println("Seu triângulo é um TRIÂNGULO OBTUSO");
        }

    }
}
