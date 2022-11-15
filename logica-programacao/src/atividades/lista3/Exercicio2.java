package atividades.lista3;

import java.util.*;

public class Exercicio2 {
    /**
     * 2. Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida. Em seguida, mostre-os em ordem crescente e
     * decrescente.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("\n------Com Array List------");
        ArrayList <String> letrasArray = new ArrayList();
        System.out.print("Informe a primeira letra: ");
        letrasArray.add(scann.next().toUpperCase());
        System.out.print("Informe a segunda letra: ");
        letrasArray.add(scann.next().toUpperCase());
        System.out.print("Informe a terceira letra: ");
        letrasArray.add(scann.next().toUpperCase());
        System.out.println("Letras inseridas: " + letrasArray);
        Collections.sort(letrasArray);
        System.out.println("Em ordem crescente: " + letrasArray);
        Collections.sort(letrasArray, Collections.reverseOrder());
        System.out.println("Em ordem decrescente: " + letrasArray);

    }
}
