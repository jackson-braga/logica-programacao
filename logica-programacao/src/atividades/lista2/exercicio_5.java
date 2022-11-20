package atividades.lista2;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        String letra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a letra que você quer verificar");
        letra = scanner.next().toUpperCase();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("A letra " + letra + " é uma volgal!");
        }else {
            System.out.println("A letra " + letra + " é uma consoante!");
        }
    }
}
