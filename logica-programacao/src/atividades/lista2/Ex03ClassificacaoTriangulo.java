package atividades.lista2;

/* 3. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero,
Isósceles ou Escaleno. Sendo que:
        ● Triângulo Equilátero: possui os 3 lados iguais.
        ● Triângulo Isóscele: possui 2 lados iguais.
        ● Triângulo Escaleno: possui 3 lados diferentes.
* */

import java.util.Scanner;

public class Ex03ClassificacaoTriangulo {

    public static void main(String[] args) {

        double[] medidaLado = new double[3];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º lado do poligono: \n");
            medidaLado[i] = in.nextDouble();
        }

        if(medidaLado[0] < (medidaLado[1]+medidaLado[2]) && medidaLado[1] < (medidaLado[0]+medidaLado[2]) && medidaLado[2] < (medidaLado[0]+medidaLado[1])) {
            if(medidaLado[0] == medidaLado[1] && medidaLado[1] == medidaLado[2]){
                System.out.printf("É um triângulo Equilátero pois possui todas medidas iguais a %.1f", medidaLado[0]);
            } else if (medidaLado[0] != medidaLado[1] && medidaLado[1] != medidaLado[2] && medidaLado[2] != medidaLado[0]) {
                System.out.printf("É um triângulo Escaleno pois possui todas medidas diferentes: %.1f, %.1f e %.1f", medidaLado[0], medidaLado[1], medidaLado[2]);
            } else {
                System.out.printf("É um triângulo Isósceles pois possui duas medidas iguais: %.1f, %.1f e %.1f", medidaLado[0], medidaLado[1], medidaLado[2]);
            }
        } else {
            System.out.printf("As medidas %.1f, %.1f e %.1f não formam um triângulo.", medidaLado[0], medidaLado[1], medidaLado[2]);
        }

    }
}
