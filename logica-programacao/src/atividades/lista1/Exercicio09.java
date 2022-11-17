package atividades.lista1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int anoAtual = 0, ano = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ano atual:");
        anoAtual = scan.nextInt();
        System.out.println("Ano do seu Nascimento:");
        ano = scan.nextInt();
        if ((anoAtual - ano) >= 16) {
            System.out.println("Pode Votar");
        } else {
            System.out.println("Não Pode Votar");
        }
    }
}
