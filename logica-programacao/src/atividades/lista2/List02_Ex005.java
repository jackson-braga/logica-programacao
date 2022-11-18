package atividades.lista2;

import java.util.Scanner;

public class List02_Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String letra = scan.nextLine();
        letra = letra.toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
