package atividades.lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String letra;
        Scanner scan = new Scanner(System.in);
        System.out.println("Letra:");
        letra = scan.nextLine();
        letra = letra.toUpperCase();

        if ((letra.equals("A")) || (letra.equals("E")) || (letra.equals("I")) || (letra.equals("O")) || (letra.equals("U"))) {
            System.out.println("Vogal!");
        } else {
            System.out.println("Consoante!");
        }
    }
}
