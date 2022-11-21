package atividades.lista2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vet[] = new String[5];
        System.out.println("Telefonou para a vítima?");
        vet[0] = sc.nextLine().toUpperCase();
        System.out.println("Esteve no local do crime?");
        vet[1] = sc.nextLine().toUpperCase();
        System.out.println("Mora perto da vítima?\n");
        vet[2] = sc.nextLine().toUpperCase();
        System.out.println("Devia para a vítima?");
        vet[3] = sc.nextLine().toUpperCase();
        System.out.println("Já trabalhou com a vítima?");
        vet[4] = sc.nextLine().toUpperCase();

        int cont = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].charAt(0) == 'S') {
                cont++;
            }
        }

        if (cont == 5) {
            System.out.println("Assassino");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cumplice");
        } else if (cont == 2) {
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }

        sc.close();
    }
}
