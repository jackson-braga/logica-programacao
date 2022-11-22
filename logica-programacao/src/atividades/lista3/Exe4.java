package atividades.lista3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */

public class Exe4 {

    public static void main(String[] args) {
// Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
//  a. A quantidade de pessoas em cada faixa etária;
//  b. A percentagem de pessoas nas faixa etária, com relação ao total de pessoas:
//     ● Até 15 anos
//     ● De 16 a 30 anos
//     ● De 31 a 45 anos
//     ● De 46 a 60 anos
//     ● Acima de 61 anos

        Scanner input = new Scanner(System.in);
        System.out.println("Digite as idades: ");

        int idade1 = input.nextInt();
        int idade2 = input.nextInt();
        int idade3 = input.nextInt();
        int idade4 = input.nextInt();
        int idade5 = input.nextInt();
        int idade6 = input.nextInt();
        int idade7 = input.nextInt();
        int idade8 = input.nextInt();
        int idade9 = input.nextInt();
        int idade10 = input.nextInt();

        int[] idades = {idade1,idade2,idade3,idade4,idade5,idade6,idade7,idade8,idade9,idade10};

        double faixaEtaria1 = 0;
        double faixaEtaria2 = 0;
        double faixaEtaria3 = 0;
        double faixaEtaria4 = 0;
        double faixaEtaria5 = 0;


        for (int i= 0; i < idades.length; i++){
            if (idades [i] <= 15){
                faixaEtaria1++;
        } else if (idades[i] >=16 && idades[i] <= 30) {
                faixaEtaria2++;
            }else if (idades[i] >=31 && idades[i] <= 45){
                faixaEtaria3++;
            }else if (idades[i] >=46 && idades[i] <= 60){
                faixaEtaria4++;
            }else if (idades[i] >=61){
                faixaEtaria5++;
            }

        }
        System.out.printf("Faixa Etária até 15 anos - %.0f\n" , faixaEtaria1);
        System.out.printf("Faixa Etária 16 a 30  anos - %.0f\n" ,faixaEtaria2);
        System.out.printf("Faixa Etária 31 a 45 anos - %.0f\n" , faixaEtaria3);
        System.out.printf("Faixa Etária 46 a 60 anos - %.0f\n" ,faixaEtaria4);
        System.out.printf("Faixa Etária acima de 61 anos - %.0f \n\n" , faixaEtaria5);

        System.out.println("#################################################################################\n");

        System.out.printf("Porcentagem Faixa Etária até 15 anos: %.0f%%\n" ,(faixaEtaria1 /idades.length) *100 );
        System.out.printf("Porcentagem Faixa Etária 16 a 30  anos: %.0f%%\n" ,(faixaEtaria2 /idades.length) *100 );
        System.out.printf("Porcentagem Faixa Etária 31 a 45 anos: %.0f%%\n" ,(faixaEtaria3 /idades.length) *100 );
        System.out.printf("Porcentagem Faixa Etária 46 a 60 anos: %.0f%%\n" ,(faixaEtaria4 /idades.length) *100 );
        System.out.printf("Porcentagem Faixa Etária acima de 61 anos: %.0f%%\n" ,(faixaEtaria5 /idades.length) *100 );
    }

}

