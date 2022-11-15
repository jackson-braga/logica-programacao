package atividades.lista3;

import java.util.Scanner;

public class Exercicio6 {
    /**
     * Faça um programa que apresente o menu de opções a seguir:
     * Menu de opções:
     * 1. Média aritmética
     * 2. Média ponderada
     * 3. Sair
     * Digite a opção desejada:
     * ● Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
     * ● Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
     * ● Na opção 3: sair do programa.
     * Verifique a possibilidade de opção inválida, mostrando uma mensagem.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double primeiraNota, segundaNota, terceiraNota;
        int pesoUm, pesoDois, pesoTres;
        int opcao = 0;
        do {
            System.out.println("Selecione uma das opções: ");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            opcao = scann.nextInt();
            if (opcao < 1 || opcao > 3) System.out.println("Informe uma opção válida");
        } while (opcao < 1 || opcao > 3);
        switch (opcao) {
            case 1:
                System.out.println("Média Aritimética");
                System.out.print("Informe a primeira nota: ");
                primeiraNota = scann.nextDouble();
                System.out.print("Informe a segunda nota: ");
                segundaNota = scann.nextDouble();
                System.out.printf("\nA média aritimética das notas é %.1f: ", media(primeiraNota, segundaNota));
                break;
            case 2:
                System.out.println("Média Ponderada");
                System.out.print("Informe a primeira nota: ");
                primeiraNota = scann.nextDouble();
                System.out.print("Informe o peso da primeira nota: ");
                pesoUm = scann.nextInt();
                System.out.print("Informe a segunda nota: ");
                segundaNota = scann.nextDouble();
                System.out.print("Informe o peso da segunda nota: ");
                pesoDois = scann.nextInt();
                System.out.print("Informe a terceira nota: ");
                terceiraNota = scann.nextDouble();
                System.out.print("Informe o peso da segunda nota: ");
                pesoTres = scann.nextInt();
                System.out.printf("\nA média ponderada das notas é: %.1f", mediaPonderada(primeiraNota, segundaNota, terceiraNota, pesoUm, pesoDois, pesoTres));
                break;
            case 3:
                System.out.println("Finalizando sistema.");
                System.exit(0);
                break;
        }
    }


    public static double media(double primeiraNota, double segundaNota) {
        double media = 0;
        media = (primeiraNota + segundaNota)/2;
        return media;
    }

    private static double mediaPonderada(double primeiraNota, double segundaNota, double terceiraNota, int pesoUm, int pesoDois, int pesoTres) {
        double mediaPonderada=0;
        mediaPonderada = ((primeiraNota*pesoUm)+(segundaNota*pesoDois)+(terceiraNota+pesoTres))/(pesoUm+pesoDois+pesoTres);
        return mediaPonderada;
    }
}
