package atividades.lista2;

import java.util.Scanner;

public class Exercicio2 {
    /**
     * Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o
     * seguinte:
     * ● Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
     * ● Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
     * ● Se o número de lados for igual a 5 escrever PENTÁGONO.
     * ● se o número de lados for inferior a 3 escrever NÃO É UM POLÍGONO.
     * ● se o número de lados for superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a quantidade de lados do polígono: ");
        int qLados = scann.nextInt();
        double[] lados = new double[qLados];
        /** usando foreach */
        int cont = 0;
        for (double lado: lados) {
            System.out.print("Informe o " + (cont + 1) + "º lado do polígono em cm: ");
            lados[cont] = scann.nextDouble();
            cont++;
        }
        /** usando for */
//        for (int i = 0; i <= qLados - 1; i++) {
//            System.out.print("Informe o " + (i + 1) + "º lado do polígono em cm: ");
//            lados[i] = scann.nextDouble();
//        }
        //calcula área
        double area = 0;
        for (int i = 0; i < lados.length; i++) {
            //usando ternário
            area = area == 0 ? lados[i] :  area * lados[i];
        }
        if (qLados == 3) {
            System.out.println("\nTRIÂNGULO");
            System.out.println("A área total é de: " + area + " cm².");
        } else if (qLados == 4) {
            System.out.println("\nQUADRADO");
            System.out.println("A área total é de: " + area + " cm².");
        }
        if (qLados == 5) {
            System.out.println("\nPENTÁGONO");
            System.out.println("A área total é de: " + area + " cm².");
        }
        if (qLados < 3) {
            System.out.println("\nNÃO É UM POLÍGONO");
        }
        if (qLados > 5) {
            System.out.println("\nPOLÍGONO NÃO IDENTIFICADO");
        }

    }
}

