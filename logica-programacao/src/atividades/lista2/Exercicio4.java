package atividades.lista2;

import java.util.Scanner;

public class Exercicio4 {
    /**
     * Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou
     * Obtusângulo. Sendo que:
     * ● Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
     * ● Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º)
     * ● Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe o primeiro ângulo: ");
        float anguloUm = scann.nextFloat();
        System.out.print("Informe o segundo ângulo: ");
        float anguloDois = scann.nextFloat();
        System.out.print("Informe o terceiro ângulo: ");
        float anguloTres = scann.nextFloat();

        if (anguloUm == 90 || anguloDois == 90 || anguloTres == 90) {
            System.out.println("Triângulo Retângulo: possui um ângulo reto. (igual a 90º)");
        } else if (anguloUm >= 90 || anguloDois >= 90 || anguloTres >= 90) {
            System.out.println("Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º)");
        } else if (anguloUm < 90 || anguloDois < 90 || anguloTres < 90) {
            System.out.println("Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)");
        } else {
            System.out.println("Não foi possível identificar o ângulo.");
        }

    }
}
