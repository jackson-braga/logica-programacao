package atividades.lista2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de lados: ");
        int quantLados = sc.nextInt();

        if (quantLados == 3) {
            System.out.println("O objeto é um triângulo: ");
            System.out.println("Entre com o tamanho de cada lado: ");
            double triagLado1 = sc.nextDouble();
            double triagLado2 = sc.nextDouble();
            double trianArea = (triagLado1 * triagLado2) / 2;
            System.out.println("O calculo da área é: " + trianArea);
        } else if (quantLados == 4) {
            System.out.println("O objeto é um quadrado: ");
            System.out.println("Entre com o tamanho de cada lado: ");
            double quadrLado1 = sc.nextDouble();
            double quadrLado2 = sc.nextDouble();
            double quadrArea = quadrLado1 * quadrLado2;
            System.out.println("O calculo da área é: " + quadrArea);
        } else if (quantLados == 5) {
            System.out.println("O objeto é um pentágono: ");
            System.out.println("Entre com o tamanho de cada lado: ");
            double PentLado1 = sc.nextDouble();
            double PentLado2 = sc.nextDouble();
            double PentArea = 2 * (PentLado1 + PentLado2);
            System.out.println("O calculo da área é: " + PentArea);
        } else if (quantLados < 3) {
            System.out.println("O objeto não é um poligono");
        } else {
            System.out.println("Polígono não identificado");
        }

        sc.close();
    }
}
