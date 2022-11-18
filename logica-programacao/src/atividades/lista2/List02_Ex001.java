package atividades.lista2;

import java.util.Scanner;

public class List02_Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = scan.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar sangue");
        } else {
            System.out.println("Você não pode doar sangue");
        }
    }
}
