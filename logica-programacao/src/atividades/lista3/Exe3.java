package atividades.lista3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe3 {
    static int contador = 0;

    public static void main(String[] args) {
//        Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade
//        de pessoas com idade maior ou igual a 18 anos.


        Scanner input = new Scanner(System.in);

        int idade1 = input.nextInt();
        contadorIdade(idade1);
        int idade2 = input.nextInt();
        contadorIdade(idade2);
        int idade3 = input.nextInt();
        contadorIdade(idade3);
        int idade4 = input.nextInt();
        contadorIdade(idade4);
        int idade5 = input.nextInt();
        contadorIdade(idade5);
        int idade6 = input.nextInt();
        contadorIdade(idade6);
        int idade7 = input.nextInt();
        contadorIdade(idade7);
        int idade8 = input.nextInt();
        contadorIdade(idade8);
        int idade9 = input.nextInt();
        contadorIdade(idade9);
        int idade10 = input.nextInt();
        contadorIdade(idade10);

        System.out.println(contador + " é a quantidade de pessoas maiores de 18 anos");

    }

    private static void contadorIdade(int idade) {
        if (idade >= 18){
            contador++;
        }
    }
}
