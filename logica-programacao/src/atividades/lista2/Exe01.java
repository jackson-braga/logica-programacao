package atividades.lista2;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {

        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar!");

        } else {
            System.out.println("Você não pode doar!");

        }

    }

}
