package atividades.lista3;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double prova1 = 0, prova2 = 0, media = 0;
        String recalculo = "S";
        Scanner scan = new Scanner(System.in);
        while (recalculo.equals("S")) {
            System.out.println("Nota da Primeira Avaliação:");
            prova1 = scan.nextDouble();
            while (prova1 < 0) {
                System.out.println("VALOR INVÁLIDO!");
                System.out.println("Digite Nota da Primeira Avaliação:");
                prova1 = scan.nextDouble();
            }
            System.out.println("Nota da Segunda Avaliação:");
            prova2 = scan.nextDouble();
            while (prova2 < 0) {
                System.out.println("VALOR INVÁLIDO!");
                System.out.println("Digite Nota da Segunda Avaliação:");
                prova2 = scan.nextDouble();
            }
            media = (prova1 + prova2) / 2;
            System.out.println("Média:" + media);
            System.out.println("NOVO CÁLCULO (S/N)?");
            recalculo = scan.next();
            recalculo.toUpperCase();
        }
    }
}
