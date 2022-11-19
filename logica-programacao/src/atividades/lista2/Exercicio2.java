package lista2;

import java.util.Scanner;

public class Exercicio2 {

    // Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
    // Calcular e imprimir o seguinte:
    // ● Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do perímetro.
    // ● Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
    // ● Se o número de lados for igual a 5 escrever PENTÁGONO.
    // ● se o número de lados for inferior a 3 escrever NÃO É UM POLÍGONO.
    // ● se o número de lados for superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de lados de um polígono: ");
        int numeroLados = input.nextInt();

        if (numeroLados < 3) {
            System.out.println("Não é um polígono");
            return;
        }

        if (numeroLados > 5) {
            System.out.println("Polígono não identificado");
            return;
        }

        System.out.println("Informe a medida do lado (em cm): ");
        double lado = input.nextDouble();

        double areaTriangulo = (Math.sqrt(3)*lado*lado)/4;
        double areaQuadrado = lado*lado;

        if (numeroLados == 3) {
            System.out.println("Triângulo");
            System.out.println("O perímetro do triângulo é: " + areaTriangulo + " cm2");
        } else if (numeroLados == 4) {
            System.out.println("Quadrado");
            System.out.println("A área do quadrado é: " + areaQuadrado + " cm2");
        } else if (numeroLados == 5) {
            System.out.println("Pentágono");
        }
    }
}
