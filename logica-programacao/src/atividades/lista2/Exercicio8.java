package atividades.lista2;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //8. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        //1. Telefonou para a vítima?
        //2. Esteve no local do crime?
        //3. Mora perto da vítima?
        //4. Devia para a vítima?
        //5. Já trabalhou com a vítima?
        //O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
        //positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“.
        //Caso contrário, ele será classificado como “Inocente“.
        Scanner scann = new Scanner(System.in);
        System.out.println("Responda 'true' para positivo e 'false' para negativo!");
        System.out.println("Telefonou para a vítima?");
        boolean resposta1 = scann.nextBoolean();

        System.out.println("Esteve no local do crime?");
        boolean resposta2 = scann.nextBoolean();

        System.out.println("Mora perto da vítima?");
        boolean resposta3 = scann.nextBoolean();

        System.out.println("Devia para a vítima?");
        boolean resposta4 = scann.nextBoolean();

        System.out.println("Já trabalhou com a vítima?");
        boolean resposta5 = scann.nextBoolean();

        Boolean[] vogais = {resposta1, resposta2, resposta3, resposta4, resposta5};

        int cont = 0;

        for(int i = 0; i < 5; i++){
            if(vogais[i]){
                cont++;
            }
        }

        if(cont == 2){
            System.out.println("Você é Suspeito!");
        }else if(cont == 3 || cont == 4){
            System.out.println("Você é Cúmplice!");
        }else if(cont == 5){
            System.out.println("Você é o Assassino!");
        }else{
            System.out.println("Você é o Inocente!");
        }
    }
}
