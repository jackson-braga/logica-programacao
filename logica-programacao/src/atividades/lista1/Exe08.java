package atividades.lista1;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        float notaUm;
        float notaDois;
        float media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        notaUm = scanner.nextFloat();

        System.out.println("Digite sua segunda nota:");
        notaDois = scanner.nextFloat();

        media = (notaUm + notaDois) / 2;

        if (media >= 6.0f) {
            System.out.println("Sua média foi: " + media +  " - Aprovado!");

        } else {
            System.out.println("Sua média foi: " + media +  " - Reprovado!");

        }

    }

}

