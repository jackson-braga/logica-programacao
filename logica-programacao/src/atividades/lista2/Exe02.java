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
            System.out.println("� um Tri�ngulo com �rea de " + area + "cm.");

        } else if (numeroLados == 4) {
            area = medidaLado * 2;
            System.out.println("� um Quadrado com �rea de " + area + "cm.");

        } else if (numeroLados == 5) {
            System.out.println("� um Pent�gono.");

        } else if (numeroLados < 3) {
            System.out.println("N�o � um pol�gono!");

        } else {
            System.out.println("Pol�gono n�o identificado!");

        }

    }

}
