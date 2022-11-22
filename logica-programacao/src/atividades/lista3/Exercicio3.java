package atividades.lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de pessoas com idade maior ou
        //igual a 18 anos.

        Scanner scann = new Scanner(System.in);
        int cont = 0;
        System.out.println("Informe a idade da primeira pessoa.");
        int idade1 = scann.nextInt();

        System.out.println("Informe a idade da segunda pessoa.");
        int idade2 = scann.nextInt();

        System.out.println("Informe a idade da terceira pessoa.");
        int idade3 = scann.nextInt();

        System.out.println("Informe a idade da quarta pessoa.");
        int idade4 = scann.nextInt();

        System.out.println("Informe a idade da quinta pessoa.");
        int idade5 = scann.nextInt();

        System.out.println("Informe a idade da sexta pessoa.");
        int idade6 = scann.nextInt();

        System.out.println("Informe a idade da setima pessoa.");
        int idade7 = scann.nextInt();

        System.out.println("Informe a idade da oitava pessoa.");
        int idade8 = scann.nextInt();

        System.out.println("Informe a idade da nona pessoa.");
        int idade9 = scann.nextInt();

        System.out.println("Informe a idade da decima pessoa.");
        int idade10 = scann.nextInt();

        if(idade1 >= 18){cont+=1;}
        if(idade2 >= 18){cont+=1;}
        if(idade3 >= 18){cont+=1;}
        if(idade4 >= 18){cont+=1;}
        if(idade5 >= 18){cont+=1;}
        if(idade6 >= 18){cont+=1;}
        if(idade7 >= 18){cont+=1;}
        if(idade8 >= 18){cont+=1;}
        if(idade9 >= 18){cont+=1;}
        if(idade10 >= 18){cont+=1;}

        System.out.println("Pessoas com idade maior ou igual a 18 anos: " + cont + " pessoas.");
    }
}
