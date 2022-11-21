package atividades.lista3;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        double valorUm;
        double valorDois;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        valorUm = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        valorDois = scanner.nextDouble();

        while (valorDois == 0) {
            System.out.println("Valor Inválido!");
            System.out.println("Digite o segundo valor:");
            valorDois = scanner.nextDouble();

            if (valorDois != 0) {
                break;
            }

        }

        double resultado = valorUm / valorDois;
        System.out.println("O resultado da divisão do primeiro valor pelo segundo valor é: " + resultado + "!");

    }

}
