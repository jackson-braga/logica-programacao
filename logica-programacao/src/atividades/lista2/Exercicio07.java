package atividades.lista2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o ano: ");
        int ano = sc.nextInt();
        double anoDiv4 = ano % 4;
        double anoDiv100 = ano % 100;
        double anoDiv400 = ano % 400;

        if (anoDiv4 == 0 && anoDiv100 != 0) {
            System.out.println("O ano é bissexto");
        } else if (ano > 400 && anoDiv400 == 0) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }

        sc.close();
    }
}
