//   1. Escreva um programa para ler as dimensões de um retângulo
//   (base e altura), calcular e escrever a área do retângulo.

import java.sql.SQLOutput;
import java.util.Scanner;

public class lista2_exercicio_01 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Digite o valor da BASE do retângulo (número inteiro):");
        int base = scann.nextInt();
        System.out.println("Digite o valor da ALTURA do retângulo (número inteiro):");
        int altura = scann.nextInt();
        int area = base * altura;

        System.out.println("A área do retângulo é " + area);
    }
}
