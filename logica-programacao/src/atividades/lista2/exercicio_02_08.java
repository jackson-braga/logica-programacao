//  8. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
//  As perguntas são:
//  1. Telefonou para a vítima?
//  2. Esteve no local do crime?
//  3. Mora perto da vítima?
//  4. Devia para a vítima?
//  5. Já trabalhou com a vítima?
//  O programa deve no final emitir uma classificação sobre a participação
//  da pessoa no crime. Se a pessoa responder positivamente a 2 questões
//  ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice”
//  e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.

import java.util.Scanner;

public class exercicio_02_08 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int resposta = 0;
        int contador = 0;
        System.out.println("Responda às perguntas com 1 para 'sim' ou 0 para 'nao'!");
        System.out.println("########################");
        System.out.println("Telefonou para a vítima?");
        resposta = scann.nextInt();
        if (resposta == 1) {
            contador = contador + 1;
        } else {
            contador = contador;
        }

        System.out.println("Esteve no local do crime?");
        resposta = scann.nextInt();
        if (resposta == 1) {
            contador = contador + 1;
        } else {
            contador = contador;
        }

        System.out.println("Mora perto da vítima?");
        resposta = scann.nextInt();
        if (resposta == 1) {
            contador = contador + 1;
        } else {
            contador = contador;
        }

        System.out.println("Devia para a vítima?");
        resposta = scann.nextInt();
        if (resposta == 1) {
            contador = contador + 1;
        } else {
            contador = contador;
        }

        System.out.println("Já trabalhou com a vítima?");
        resposta = scann.nextInt();
        if (resposta == 1) {
            contador = contador + 1;
        } else {
            contador = contador;
        }

        if (contador <= 1) {
            System.out.println("Inocente");
        } else if (contador == 2) {
            System.out.println("Suspeito(a)");
        } else if (contador == 3 || contador == 4){
            System.out.println("Cúmplice");
        } else {
            System.out.println("Assassino(a)");
        }

    }
}
