package atividades.lista1;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        double notaUm;
        double notaDois;
        double notaTres;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota:");
        notaUm = scanner.nextDouble();

        System.out.println("Digite sua segunda nota:");
        notaDois = scanner.nextDouble();

        System.out.println("Digite sua terceira nota:");
        notaTres = scanner.nextDouble();

        double notaFinalUm = notaUm * 2;
        double notaFinalDois = notaDois * 3;
        double notaFinalTres = notaTres * 5;

        double mediaFinal = (notaFinalUm + notaFinalDois + notaFinalTres) / (2+3+5);

        System.out.println("Sua média final é: " + mediaFinal + ".");

    }

}
