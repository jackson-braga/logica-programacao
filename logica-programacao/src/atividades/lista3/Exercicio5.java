package atividades.lista3;

import java.util.Scanner;

public class Exercicio5 {
    /**
     * Faça um programa que recebe a altura de um triângulo em um número inteiro e imprima-o utilizando asteriscos. Veja o
     * Exemplo:
     * Entrada: 5
     * *
     * **
     * ***
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double quantidadeLinha = 0;
        System.out.println("-----Desenho de retângulo (um ângulo reto)-----");
        do {
            System.out.println("\nInforme uma quantidade de linhas para definir o tamanho do retângulo: ");
            quantidadeLinha = sc.nextDouble();
            if (quantidadeLinha <= 1)
                System.out.println("Para renderizar o triângulo é necessário que o valor seja maior que 1.");
        } while (quantidadeLinha <= 1);
        //desenha triangulo
        new Exercicio5().desenhaTrinagulo(quantidadeLinha);
        new Exercicio5().desenhaTrinaguloRepeat(quantidadeLinha);
    }

    public void desenhaTrinagulo(double qLinha) {
        for (qLinha = qLinha; qLinha > 0; qLinha--) {
            for (double y = qLinha; y > 0; y--) System.out.print("*");
            System.out.println();
        }
    }

    public void desenhaTrinaguloRepeat(double qLinha) {
        for (double i = 0; i < qLinha; i++) {
            for (double k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
