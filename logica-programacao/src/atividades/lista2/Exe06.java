package atividades.lista2;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        double notaUm;
        double notaDois;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        notaUm = scanner.nextDouble();

        System.out.println("Digite sua segunda nota:");
        notaDois = scanner.nextDouble();

        media = (notaUm + notaDois) / 2;

        if (media >= 9.0 && media <= 10.0) {
            System.out.println("-------------------------------------");
            System.out.println("Suas notas foram: " + notaUm + " e " + notaDois + ";");
            System.out.println("Suas média foi: " + media + ";");
            System.out.println("Conceito: A.");
            System.out.println("APROVADO");
            System.out.println("-------------------------------------");
        }

        if ( media >= 7.5 && media < 9.0) {
            System.out.println("-------------------------------------");
            System.out.println("Suas notas foram: " + notaUm + " e " + notaDois + ";");
            System.out.println("Suas média foi: " + media + ";");
            System.out.println("Conceito: B.");
            System.out.println("APROVADO");
            System.out.println("-------------------------------------");
        }

        if ( media >= 6.0 && media < 7.5) {
            System.out.println("-------------------------------------");
            System.out.println("Suas notas foram: " + notaUm + " e " + notaDois + ";");
            System.out.println("Suas média foi: " + media + ";");
            System.out.println("Conceito: C.");
            System.out.println("APROVADO");
            System.out.println("-------------------------------------");
        }

        if ( media >= 4.0 && media < 6.0) {
            System.out.println("-------------------------------------");
            System.out.println("Suas notas foram: " + notaUm + " e " + notaDois + ";");
            System.out.println("Suas média foi: " + media + ";");
            System.out.println("Conceito: D.");
            System.out.println("REPROVADO");
            System.out.println("-------------------------------------");
        }

        if ( media >= 0 && media < 4.0) {
            System.out.println("-------------------------------------");
            System.out.println("Suas notas foram: " + notaUm + " e " + notaDois + ";");
            System.out.println("Suas média foi: " + media + ";");
            System.out.println("Conceito: E.");
            System.out.println("REPROVADO");
            System.out.println("-------------------------------------");
        }

    }

}
