package atividades.lista2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int lados = 0;
        double medida = 0, area = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Número de Lados:");
        lados = scan.nextInt();

        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (lados > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        } else {
            System.out.println("Medida do Lado:");
            medida = scan.nextDouble();
            while (medida <= 0) {
                System.out.println("Medida INVÁLIDA!");
                System.out.println("Digite medida do lado:");
                medida = scan.nextDouble();
            }
            if (lados == 3) {
                System.out.println("TRIÂNGULO");
                area = (lados * lados) / 2;
                System.out.println("Area: " + area);
            } else if (lados == 4) {
                System.out.println("QUADRADO");
                area = lados * lados;
                System.out.println("Area: " + area);
            } else if (lados == 5) {
                System.out.println("PENTÁGONO");
            }
        }
    }
}
