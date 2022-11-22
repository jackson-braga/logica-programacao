package atividades.lista2;

import java.util.Scanner;

public class Exercicio3 {
    /**
     * Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
     * Sendo que:
     * ● Triângulo Equilátero: possui os 3 lados iguais.
     * ● Triângulo Isóscele: possui 2 lados iguais.
     * ● Triângulo Escaleno: possui 3 lados diferentes
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe o primeiro lado (cm): ");
        int ladoUm = scann.nextInt();
        System.out.print("Informe o segundo lado (cm): ");
        int ladoDois = scann.nextInt();
        System.out.print("Informe o terceiro lado (cm): ");
        int ladoTres = scann.nextInt();

        if (ladoUm == ladoDois && ladoUm == ladoTres && ladoDois == ladoTres) {
            System.out.println("Triângulo Equilátero!");
        } else if (ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
            System.out.println("Triângulo Isóceles!");
        } else {
            System.out.println("Triângulo Escaleno!");
            System.out.println("Triângulo Escaleno!");
            System.out.println("Triângulo Escaleno!");
        }
    }
}
