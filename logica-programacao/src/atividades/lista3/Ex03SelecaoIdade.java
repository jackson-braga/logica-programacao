package atividades.lista3;

/* 3. Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de pessoas com idade maior ou
igual a 18 anos.
* */

import java.util.Scanner;

public class Ex03SelecaoIdade {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] idade = new int[10];
        int qtPessoas = 0;

        for(int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
            idade[i] = in.nextInt();
            if(idade[i] >= 18)
                qtPessoas++;
        }
        System.out.printf("Existem %d pessoas maiores de 18 anos\n", qtPessoas);



    }
}
