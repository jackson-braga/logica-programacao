package atividades.lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //4. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou
        //Obtusângulo. Sendo que:
        //● Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
        //● Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
        //● Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o primeiro angulo.");
        int angulo1 = scann.nextInt();
        System.out.println("Informe o segundo angulo.");
        int angulo2 = scann.nextInt();
        System.out.println("Informe o terceiro angulo.");
        int angulo3 = scann.nextInt();

        if((angulo1 == 90 && angulo1 != angulo3 && angulo2 != angulo1) || (angulo2 == 90 && angulo2 != angulo3 && angulo2 != angulo1)
                || (angulo3 == 90 && angulo2 != angulo3 && angulo1 != angulo3)) {
            System.out.println("Triângulo Retângulo.");
        } else if ((angulo1 > 90 && angulo2 <= 90 && angulo3 <= 90) || (angulo2 > 90 && angulo1 <= 90 && angulo3 <= 90)
                || (angulo3 > 90 && angulo1 <= 90 && angulo2 <= 90)) {
            System.out.println("Triângulo Obtusângulo.");
        }else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            System.out.println("Triângulo Acutângulo.");
        }

        }

}
