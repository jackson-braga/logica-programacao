package atividades.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        //6. Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considere que a média é
        //ponderada e que o peso das notas é 2, 3 e 5.
        //Fórmula para o cálculo da média final é:

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe a primeira nota.");
        int primeiraNota = scann.nextInt() * 2;

        System.out.println("Informe a segunda nota.");
        int segundaNota = scann.nextInt() *3;

        System.out.println("Informe a terceira nota.");
        int terceiraNota = scann.nextInt() *5;

        System.out.println("A média final é de " + (primeiraNota + segundaNota + terceiraNota)/(2+3+5) + "." );
    }
}
