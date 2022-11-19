package lista2;

import java.util.Scanner;

public class Exercicio3 {
    // Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero,
    // Isósceles ou Escaleno. Sendo que:
    // ● Triângulo Equilátero: possui os 3 lados iguais.
    // ● Triângulo Isóscele: possui 2 lados iguais.
    // ● Triângulo Escaleno: possui 3 lados diferentes.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a medida do lado 1: ");
        float lado1 = input.nextFloat();

        System.out.println("Informe a medida do lado 2: ");
        float lado2 = input.nextFloat();

        System.out.println("Informe a medida do lado 3: ");
        float lado3 = input.nextFloat();

        if ((lado1 == lado2) && (lado1 == lado3)) {
            System.out.println("Triângulo equilátero");
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado3 ==lado1)) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}
