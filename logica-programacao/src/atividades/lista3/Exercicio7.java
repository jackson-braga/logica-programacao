package atividades.lista3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        //7. Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja,
        //para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo
        //valor lido. Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício caso o segundo valor informado seja ZERO.

        Scanner scann = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int valor1 = scann.nextInt();

        System.out.println("Insira o segundo valor:");
        int valor2 = scann.nextInt();
        while(valor2 == 0){
            System.out.println("0 não é permitido! Digite um valor válido:");
            valor2 = scann.nextInt();
        }

        System.out.println("A divisão do primeiro valor pelo segundo é de " + (valor1/valor2) + ".");
    }

}
