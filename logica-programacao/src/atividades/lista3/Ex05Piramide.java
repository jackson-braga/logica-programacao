package atividades.lista3;

/* 5. Faça um programa que recebe a altura de um triângulo em um número inteiro e imprima-o utilizando asteriscos. Veja o
Exemplo:
Entrada: 5
*
**
***
****
*****
* */

import java.util.Scanner;

public class Ex05Piramide {

    public static void main(String[] args) {

        int tamanho;
        String caractere = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho que deseja imprimir o triângulo: ");
        tamanho = in.nextInt();

        for (int i = 0; i < tamanho ; i++) {
            caractere += "*";
            System.out.println(caractere);
        }
    }

}
