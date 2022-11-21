package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
//3. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero,
//Isósceles ou Escaleno. Sendo que:
//● Triângulo Equilátero: possui os 3 lados iguais.
//● Triângulo Isóscele: possui 2 lados iguais.
//● Triângulo Escaleno: possui 3 lados diferentes.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite as medidas do triângulo.");
        int ladoA = input.nextInt();
        int ladoB = input.nextInt();
        int ladoC = input.nextInt();
        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("Equilátero.");
        } else if (ladoA == ladoB && ladoA != ladoC) {
            System.out.println("Isóscele.");
        } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            System.out.println("Escaleno.");
        }

    }
}
