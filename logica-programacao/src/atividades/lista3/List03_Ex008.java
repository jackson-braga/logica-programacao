package atividades.lista3;

import java.util.Scanner;

public class List03_Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;
        String continua;
        do {
            do {
                System.out.println("Digite a primeira nota");
                nota1 = scan.nextInt();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Valor inválido");
                    continue;
                }
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.println("Digite a segunda nota");
                nota2 = scan.nextInt();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Valor inválido");
                    continue;
                }
            } while (nota2 < 0 || nota2 > 10);
            media = (nota1 + nota2) / 2;
            System.out.printf("A média final é de " + "%.2f", media);
            System.out.println("\nContinuar? S/N");
            continua = scan.next();
            continua = continua.toUpperCase();
        } while(continua.equals("S"));
    }
}
