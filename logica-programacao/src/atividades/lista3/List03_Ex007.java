package atividades.lista3;

import java.util.Scanner;

public class List03_Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        float valor1 = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        float valor2 = scan.nextFloat();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO");
            System.out.println("Digite o segundo valor: ");
            valor2 = scan.nextFloat();
        }

        float media = (valor1 + valor2) / 2;
        System.out.println("A divisão dos valores é: " + media);
    }
}
