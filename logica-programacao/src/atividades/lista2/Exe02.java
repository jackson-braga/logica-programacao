package atividades.lista2;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {

        int numeroLados;
        double medidaLado;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de lados:");
        numeroLados = scanner.nextInt();

        System.out.println("Medida em cm de cada lado:");
        medidaLado = scanner.nextInt();

        if (numeroLados == 3) {
            area = ((medidaLado * 2) * Math.sqrt(3)) / 4;
            System.out.println("É um Triângulo com área de " + area + "cm.");

        } else if (numeroLados == 4) {
            area = medidaLado * 2;
            System.out.println("É um Quadrado com área de " + area + "cm.");

        } else if (numeroLados == 5) {
            System.out.println("É um Pentágono.");

        } else if (numeroLados < 3) {
            System.out.println("Não é um polígono!");

        } else {
            System.out.println("Polígono não identificado!");

        }

    }

}
