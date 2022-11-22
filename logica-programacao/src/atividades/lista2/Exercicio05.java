package atividades.lista2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra maiscula: ");
        char letra = sc.next().charAt(0);
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        }

        sc.close();
    }
}
