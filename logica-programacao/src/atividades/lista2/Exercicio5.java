package atividades.lista2;

import java.util.Scanner;

public class Exercicio5 {
    /***
     * 5. Faça um programa que verifique se uma letra digitada é vogal ou consoante.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a letra: ");
        char letra = Character.toUpperCase(scann.next().charAt(0));
        switch (letra) {
            case 'A':
                System.out.println("É vogal");
                break;
            case 'E':
                System.out.println("É vogal");
                break;
            case 'I':
                System.out.println("É vogal");
                break;
            case 'O':
                System.out.println("É vogal");
                break;
            case 'U':
                System.out.println("É vogal");
                break;
            default:
                System.out.println("É consoante");

        }
    }
}
