package atividades.lista2;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {

        double ladoA;
        double ladoB;
        double ladoC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Medida lado A:");
        ladoA = scanner.nextDouble();

        System.out.println("Medida lado B:");
        ladoB = scanner.nextDouble();

        System.out.println("Medida lado C:");
        ladoC = scanner.nextDouble();

        if ((ladoA == ladoB) && (ladoA == ladoC)) {
            System.out.println("Triângulo Equilátero.");

        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)) {
            System.out.println("Triângulo Isósceles.");

        } else {
            System.out.println("Triângulo Escaleno.");

        }

    }

}
