package lista2;

//      3. Escreva um programa que leia as medidas dos lados
//      de um triângulo e escreva se ele é Equilátero,
//      Isósceles ou Escaleno.
//      Sendo que:
//          ● Triângulo Equilátero: possui os 3 lados iguais.
//          ● Triângulo Isóscele: possui 2 lados iguais.
//          ● Triângulo Escaleno: possui 3 lados diferentes.

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        // Criar variáveis dos lados e receber valor das medidas
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida do primeiro lado do triângulo: ");
        int ladoA = scan.nextInt();
        System.out.println("Informe a medida do segundo lado do triângulo: ");
        int ladoB = scan.nextInt();
        System.out.println("Informe a medida do terceiro lado do triângulo: ");
        int ladoC = scan.nextInt();

        // Calcular e informar o tipo do triângulo

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triângulo equilátero.");
        } else if (ladoA == ladoB && ladoB != ladoC || ladoA == ladoC && ladoB != ladoC || ladoB == ladoC && ladoA != ladoB) {
            System.out.println("Triângulo Isócele.");
        } else {
            System.out.println("Triângulo Escaleno.");
        }
    }
}

