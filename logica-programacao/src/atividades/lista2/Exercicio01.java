package atividades.lista2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue.");

        } else {
            System.out.println("Não pode doar sangue.");
        }

        sc.close();
    }

}
