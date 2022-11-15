package atividades.lista1;

import java.util.Scanner;

public class Exercicio5 {
    /**
     * . Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus
     * Celsius (baseado na fórmula abaixo):
     * Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe quantos graus em Fahrenheit: ");
        float fGraus = scann.nextFloat();
        float cGraus = ((fGraus-32)/9)*5;
        System.out.printf("\n%.2fº Celsius", cGraus);
    }
}
