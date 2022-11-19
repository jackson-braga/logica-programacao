package lista2;

import java.util.Scanner;

public class Exercicio5 {

    // Faça um programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma letra: ");
        char letra = input.next().charAt(0);

        if (letra == 'a' ||
                letra == 'e' ||
                letra == 'i' ||
                letra == 'o' ||
                letra == 'u' ||
                letra == 'A' ||
                letra == 'E' ||
                letra == 'I' ||
                letra == 'O' ||
                letra == 'U')
        {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
