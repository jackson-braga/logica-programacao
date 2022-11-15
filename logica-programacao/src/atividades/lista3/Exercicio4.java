package atividades.lista3;

import java.util.Scanner;

public class Exercicio4 {
    /**
     * Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
     * a. A quantidade de pessoas em cada faixa etária;
     * b. A percentagem de pessoas nas faixa etária, com relação ao total de pessoas:
     * ● Até 15 anos
     * ● De 16 a 30 anos
     * ● De 31 a 45 anos
     * ● De 46 a 60 anos
     * ● Acima de 61 anos
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Insira a " + (i+1) + "º idade: ");
            idades[i] = scann.nextInt();
        }
        //até 15
        int auxilio=0;
        System.out.println("------Faixa etária------\n● Até 15 anos");
        for (int idade:idades) {
            if(idade<=15) auxilio++;
        }
        System.out.println(auxilio +" pessoas até 15 anos.");
        //16 a 30
        auxilio=0;
        System.out.println("● De 16 a 30 anos");
        for (int idade:idades) {
            if(idade>=16 && idade<=30) auxilio++;
        }
        System.out.println(auxilio +" pessoas de 16 a 30 anos.");
        //31 a 45
        auxilio=0;
        System.out.println("● De 31 a 45 anos");
        for (int idade:idades) {
            if(idade>=31 && idade<=45) auxilio++;
        }
        System.out.println(auxilio +" pessoas de 31 a 45 anos.");
        //46 a 60
        auxilio=0;
        System.out.println("● De 46 a 60 anos");
        for (int idade:idades) {
            if(idade>=46 && idade<=60) auxilio++;
        }
        System.out.println(auxilio +" pessoas de 46 a 60 anos.");
        //61 acima
        auxilio=0;
        System.out.println("● Acima de 61 anos");
        for (int idade:idades) {
            if(idade>=61) auxilio++;
        }
        System.out.println(auxilio +" pessoas acima de 61 anos.");
    }

}
