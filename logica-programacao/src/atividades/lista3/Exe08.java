package atividades.lista3;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        double notaUm;
        double notaDois;
        double media;
        String resposta = "S";

        do {

            System.out.println("---------Calcule sua média---------");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua primeira nota:");
            notaUm = scanner.nextDouble();

            while (notaUm < 0 || notaUm > 10) {
                System.out.println("Valor Inválido!");
                System.out.println("Digite sua primeira nota:");
                notaUm = scanner.nextDouble();

                if (notaUm > 0 && notaUm < 10) {
                    break;
                }

            }

            System.out.println("Digite sua segunda nota:");
            notaDois = scanner.nextDouble();

            while (notaDois < 0 || notaDois > 10) {
                System.out.println("Valor Inválido!");
                System.out.println("Digite sua segunda nota:");
                notaDois = scanner.nextDouble();

                if (notaDois > 0 && notaDois < 10) {
                    break;
                }

            }

            media = (notaUm + notaDois) / 2;

            System.out.println("Sua média é " + media + "!");

            System.out.println("Novo cálculo (S/N)?");
            resposta = scanner.next();

        }

        while (resposta.equalsIgnoreCase("s"));
        System.out.println("Encerrado!");


    }

}
