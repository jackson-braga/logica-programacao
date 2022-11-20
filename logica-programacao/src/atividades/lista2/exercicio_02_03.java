//  3. Escreva um programa que leia as medidas dos lados de um
//  triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
//  Sendo que:
//  Triângulo Equilátero: possui os 3 lados iguais.
//  Triângulo Isóscele: possui 2 lados iguais.
//  Triângulo Escaleno: possui 3 lados diferentes.

import java.util.Scanner;

public class exercicio_02_03 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite o primeiro lado de seu triângulo: ");
        int lado1 = scann.nextInt();
        System.out.println("Digite o segundo lado de seu triângulo: ");
        int lado2 = scann.nextInt();
        System.out.println("Digite o terceiro e último lado de seu triângulo: ");
        int lado3 = scann.nextInt();

        if (lado1 == (lado2 = lado3)) {
            System.out.println("Seu triângulo é do tipo: EQUILÁTERO");
            //    } else if (lado1 == lado2 && lado1 != lado3 || lado1 != lado2 && lado1 == lado3 || lado2 == lado1 && lado2 != lado3 || lado2 != lado1 && lado2 == lado3 || lado3 == lado2 && lado3 != lado1 || lado3 != lado2 && lado3 == lado1) {
        }else if (lado1 != lado2 && lado1 != lado3 || lado2 != lado1 && lado2 != lado3 || lado3 != lado1 && lado3 != lado2) {
            System.out.println("Seu triângulo é do tipo: ESCALENO");
        } else {
            System.out.println("Seu triângulo é do tipo: ISÓSCELES");
        }

    }
}
