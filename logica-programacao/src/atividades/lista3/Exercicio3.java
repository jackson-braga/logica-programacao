package atividades.lista3;

import java.util.Scanner;

public class Exercicio3 {
    /**
     * 3. Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de pessoas com idade maior ou
     * igual a 18 anos.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Insira a " + (i+1) + "º idade: ");
            idades[i] = scann.nextInt();
        }
        int cont=0;
        for (int idade:idades) {
            if(idade>=18) cont++;
        }
        System.out.println("Foram inseridas "+cont+" pessoas com idade superior a 18 anos.");
    }
}
