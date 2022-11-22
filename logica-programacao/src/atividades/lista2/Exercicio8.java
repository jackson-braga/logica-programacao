package atividades.lista2;

import java.util.Scanner;

public class Exercicio8 {
    /**
     * 8. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
     * 1. Telefonou para a vítima?
     * 2. Esteve no local do crime?
     * 3. Mora perto da vítima?
     * 4. Devia para a vítima?
     * 5. Já trabalhou com a vítima?
     * O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
     * positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“.
     * Caso contrário, ele será classificado como “Inocente“
     */
    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {
        int[] respostas = new int[5];
        System.out.println("1. Telefonou para a vítima?");
        respostas[0] = opcoes();
        System.out.println("2. Esteve no local do crime?");
        respostas[1] = opcoes();
        System.out.println("3. Mora perto da vítima? ");
        respostas[2] = opcoes();
        System.out.println("4. Devia para a vítima?");
        respostas[3] = opcoes();
        System.out.println("5.Já trabalhou com a vítima?");
        respostas[4] = opcoes();
        int descisao = 0;

        for (int resposta : respostas) {
            if (resposta == 1) {
                ++descisao;
            }
        }
//        for (int i = 0; i < respostas.length; i++) {
//            if (respostas[i] == 1) {
//                ++descisao;
//            }
//        }
        System.out.println("Classificação");
        switch (descisao) {
            case 2:
                System.out.println("Suspeita.");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }

    public static int opcoes() {
        int opcao;
        do {
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opcao = scann.nextInt();
            if (opcao != 1 && opcao != 2) System.out.println("Opção inválida");
        } while (opcao != 1 && opcao != 2);
        return opcao;
    }
}
