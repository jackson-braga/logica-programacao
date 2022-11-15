package atividades.lista1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio1 {
    /**
     * 1. Escreva um programa para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        BigDecimal base;
        BigDecimal altura;
        BigDecimal area;

        System.out.print("Insira a base do retângulo: ");
        base = scann.nextBigDecimal();
        System.out.print("Insira a altura do retângulo: ");
        altura = scann.nextBigDecimal();
        area = base.multiply(altura);
        // area se fosse double base * altura.
        System.out.println("A área do retângulo é de: " + area + " m²");
    }
}
