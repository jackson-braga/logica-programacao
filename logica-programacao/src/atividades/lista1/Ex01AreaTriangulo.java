package atividades.lista1;

/* 1. Escreva um programa para ler as dimensões de um
 retângulo (base e altura), calcular e escrever a área do retângulo. */

import java.util.Scanner;

public class Ex01AreaTriangulo {

    public static void main(String[] args) {

        double base, altura, areaRetangulo;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        base = in.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        altura = in.nextDouble();

        areaRetangulo = base * altura;

        System.out.printf("O Retângulo com base %.2f e altura %.2f possui uma área de %.2f.", base, altura, areaRetangulo);

        in.close();
    }

}
