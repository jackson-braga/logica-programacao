/*Lista de Exercícios 3
Exercício 3:
Faça um programa que receba a idade de dez pessoas e que calcule e mostre a quantidade de pessoas com idade maior ou
igual a 18 anos.
 */

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int idade;
        int contador = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Digite a idade da pessoa: ");
            idade = scann.nextInt();
            if (idade >= 18) {
                contador++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de 18 anos é de: " + contador);
    }
    }
