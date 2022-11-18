package atividades.lista2;

import java.util.Scanner;

public class List02_Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a medida do primeiro lado do tirângulo: ");
        float lado1 = scan.nextFloat();
        System.out.println("Digite a medida do segundo lado do tirângulo: ");
        float lado2 = scan.nextFloat();
        System.out.println("Digite a medida do terceiro lado do tirângulo: ");
        float lado3 = scan.nextFloat();

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado1 && lado2 == lado3 && lado3 == lado1 && lado3 == lado2) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado1 && lado2 != lado3 && lado3 != lado1 && lado3 != lado2) {
            System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Triângulo Isóscele");
        }
    }
}
