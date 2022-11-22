package atividades.lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
        //a. A quantidade de pessoas em cada faixa etária;
        //b. A percentagem de pessoas nas faixa etária, com relação ao total de pessoas:
        //- Até 15 anos
        //- De 16 a 30 anos
        //- De 31 a 45 anos
        //- De 46 a 60 anos
        //- Acima de 61 anos

        Scanner scann = new Scanner(System.in);
        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;

        int[] idades;
        idades = new int[10];

        System.out.println("Informe a idade da primeira pessoa.");
        idades[0] = scann.nextInt();

        System.out.println("Informe a idade da segunda pessoa.");
        idades[1] = scann.nextInt();

        System.out.println("Informe a idade da terceira pessoa.");
        idades[2] = scann.nextInt();

        System.out.println("Informe a idade da quarta pessoa.");
        idades[3] = scann.nextInt();

        System.out.println("Informe a idade da quinta pessoa.");
        idades[4] = scann.nextInt();

        System.out.println("Informe a idade da sexta pessoa.");
        idades[5] = scann.nextInt();

        System.out.println("Informe a idade da setima pessoa.");
        idades[6] = scann.nextInt();

        System.out.println("Informe a idade da oitava pessoa.");
        idades[7] = scann.nextInt();

        System.out.println("Informe a idade da nona pessoa.");
        idades[8] = scann.nextInt();

        System.out.println("Informe a idade da decima pessoa.");
        idades[9] = scann.nextInt();

        for(int i = 0; i < idades.length; i++){
            if (idades[i] <= 15) {
                faixa1++;
            }else if (idades[i] > 15 &&  idades[i] <= 30) {
                faixa2++;
            }else if (idades[i]> 30 && idades[i]<= 45) {
                faixa3++;
            }else if (idades[i] > 30 &&  idades[i] <= 60) {
                faixa4++;
            }else if (idades[i] > 60) {
                faixa5++;
            }
        }
        System.out.println("Quantidade de pessoas por faixa etaria:");
        System.out.println("Faixa 1: " + faixa1 + " pessoas.");
        System.out.println("Faixa 2: " + faixa2 + " pessoas.");
        System.out.println("Faixa 3: " + faixa3 + " pessoas.");
        System.out.println("Faixa 4: " + faixa4 + " pessoas.");
        System.out.println("Faixa 5: " + faixa5 + " pessoas.");
    }
}