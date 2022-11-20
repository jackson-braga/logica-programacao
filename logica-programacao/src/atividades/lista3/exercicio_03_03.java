//  3. Faça um programa que receba a idade de dez pessoas e que
//  calcule e mostre a quantidade de pessoas com idade maior ou
//  igual a 18 anos.

import java.util.Scanner;

public class exercicio_03_03 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int idade;
        int cont = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Digite a idade da pessoa: ");
            idade = scann.nextInt();
            if (idade >= 18) {
                cont++;
            }
        }
        System.out.println("A quantidade de pessoas com 18 ou mais anos de idade é " + cont);

    }
}
