package atividades.lista1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o ano atual com 4 digitos: ");
        int anoAtual = sc.nextInt();
        System.out.print("Entre com o ano de nascimentol com 4 digitos: ");
        int anoNascimento = sc.nextInt();
        int idade = anoNascimento + anoAtual;

        if (idade < 16) {
            System.out.println("Você não pode votar esse ano.");
        } else {
            System.out.println("Você pode votar esse ano.");
        }
        sc.close();

    }
}
