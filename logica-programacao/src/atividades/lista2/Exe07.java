package atividades.lista2;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        int ano;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano que deseja verificar:");
        ano = scanner.nextInt();

        if ((ano % 4) == 0) {

            if ((ano % 100) == 0 ) {

                if ((ano % 400) == 0) {
                    System.out.println("É um ano bissexto!");

                } else {
                    System.out.println("Não é um ano bissexto!");

                }

            } else {
                System.out.println("É um ano bissexto!");

            }

        } else {
            System.out.println("Não é um ano bissexto!");

        }

    }

}
