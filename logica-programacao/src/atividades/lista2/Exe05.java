package atividades.lista2;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        String letra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        letra = scanner.next();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("É uma vogal!");
                break;
            default:
                System.out.println("É uma consoante!");
                break;

        }

    }

}
