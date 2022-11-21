package atividades.lista2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        String p1, p2, p3, p4, p5;
        int sim = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda com 'SIM' ou 'NAO':");
        System.out.println("1 - Telefonou para a vítima?");
        p1 = scan.nextLine();
        p1 = p1.toUpperCase();

        while (!p1.equals("SIM") && !p1.equals("NAO")) {
            System.out.println("Responda com 'SIM' ou 'NAO':");
            System.out.println("1 - Telefonou para a vítima?");
            p1 = scan.nextLine();
            p1 = p1.toUpperCase();
        }

        if (p1.equals("SIM")) {
            sim++;
        }

        System.out.println("2 - Esteve no local do crime?");
        p2 = scan.nextLine();
        p2 = p2.toUpperCase();
        while (!p2.equals("SIM") && !p2.equals("NAO")) {
            System.out.println("Responda com 'SIM' ou 'NAO':");
            System.out.println("2 - Esteve no local do crime?");
            p2 = scan.nextLine();
            p2 = p2.toUpperCase();
        }
        if (p2.equals("SIM")) {
            sim++;
        }

        System.out.println("3 - Mora perto da vítima?");
        p3 = scan.nextLine();
        p3 = p3.toUpperCase();
        while (!p3.equals("SIM") && !p3.equals("NAO")) {
            System.out.println("Responda com 'SIM' ou 'NAO':");
            System.out.println("3 -Mora perto da vítima?");
            p3 = scan.nextLine();
            p3 = p3.toUpperCase();
        }
        if (p3.equals("SIM")) {
            sim++;
        }

        System.out.println("4 - Devia para a vítima?");
        p4 = scan.nextLine();
        p4 = p4.toUpperCase();
        while (!p4.equals("SIM") && !p4.equals("NAO")) {
            System.out.println("Responda com 'SIM' ou 'NAO':");
            System.out.println("4 - Devia para a vítima?");
            p4 = scan.nextLine();
            p4 = p4.toUpperCase();
        }
        if (p4.equals("SIM")) {
            sim++;
        }

        System.out.println("5 - Já trabalhou com a vítima?");
        p5 = scan.nextLine();
        p5 = p5.toUpperCase();
        while (!p5.equals("SIM") && !p5.equals("NAO")) {
            System.out.println("Responda com 'SIM' ou 'NAO':");
            System.out.println("5 - Já trabalhou com a vítima?");
            p5 = scan.nextLine();
            p5 = p5.toUpperCase();
        }
        if (p5.equals("SIM")) {
            sim++;
        }

        if (sim == 2) {
            System.out.println("SUSPEITA");
        } else if ((sim > 2) && (sim <= 4)) {
            System.out.println("CÚMPLICE");
        } else if (sim == 5) {
            System.out.println("ASSASSINO");
        } else {
            System.out.println("INOCENTE");
        }

    }
}
