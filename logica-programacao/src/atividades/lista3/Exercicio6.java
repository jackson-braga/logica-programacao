package atividades.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //6. Faça um programa que apresente o menu de opções a seguir:
        //Menu de opções:
        //1. Média aritmética
        //2. Média ponderada
        //3. Sair
        //Digite a opção desejada:
        //● Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
        //● Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
        //● Na opção 3: sair do programa.
        //Verifique a possibilidade de opção inválida, mostrando uma mensagem.

        System.out.println("Escolha uma opção:");
        System.out.println("1. Média aritmética.");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");

        Scanner scann = new Scanner(System.in);
        int opcao = scann.nextInt();

        if(opcao == 1){
            System.out.println("Informe a primeira nota.");
            int primeiraNota = scann.nextInt();

            System.out.println("Informe a segunda nota.");
            int segundaNota = scann.nextInt();

            System.out.println("A média aritimética final é de " + (primeiraNota + segundaNota)/2f + "." );

        } else if (opcao == 2) {
            System.out.println("Informe a primeira nota.");
            int primeiraNota = scann.nextInt() * 2;

            System.out.println("Informe a segunda nota.");
            int segundaNota = scann.nextInt() *3;

            System.out.println("Informe a terceira nota.");
            int terceiraNota = scann.nextInt() *5;

            System.out.println("A média final ponderada final é de " + (primeiraNota + segundaNota + terceiraNota)/(2+3+5) + "." );

        } else if (opcao == 3) {
            System.out.println("Operação finalizada!");

        }else{
            System.out.println("Operação inválida!" );
        }
    }
}
