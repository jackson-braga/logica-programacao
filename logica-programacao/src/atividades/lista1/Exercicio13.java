package atividades.lista1;

import java.util.Scanner;

public class Exercicio13 {
    /**
     * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
     * Álcool
     * até 20 litros, desconto de 2% por litro
     * acima de 20 litros, desconto de 5% por litro
     * Gasolina
     * até 20 litros, desconto de 3% por litro
     * acima de 20 litros, desconto de 6% por litro
     * Escreva um programa que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool,
     * G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,79 e o
     * preço do litro do álcool é R$ 3,69.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Insira o número de litros vendidos: ");
        float litros = scann.nextFloat();
        System.out.print("Insira o tipo de combustível: ");
        System.out.println("\nA - Álcool");
        System.out.println("G - Gasolina");
        char combustivel = scann.next().charAt(0);
        combustivel = Character.toUpperCase(combustivel);
        float valorTotal = 0, desconto = 0, valorVenda = 0;
        switch (combustivel) {
            case 'A':
                valorVenda = litros * 3.69f;
                if (litros <= 20) {
                    desconto = 0.02f * valorVenda;
                    valorTotal = valorVenda - desconto;
                } else {
                    desconto = 0.05f * valorVenda;
                    valorTotal = valorVenda - desconto;
                }
                break;
            case 'G':
                valorVenda = litros * 4.79f;
                if (litros <= 20) {
                    desconto = 0.03f * valorVenda;
                    valorTotal = valorVenda - desconto;
                } else {
                    desconto = 0.06f * valorVenda;
                    valorTotal = valorVenda - desconto;
                }
                break;
        }
        System.out.printf("Valor da venda sem desconto: R$ %.2f", valorVenda);
        System.out.printf("\nValor de desconto: R$ %.2f", desconto);
        System.out.printf("\nValor total da venda com desconto: R$ %.2f", valorTotal);
    }
}
