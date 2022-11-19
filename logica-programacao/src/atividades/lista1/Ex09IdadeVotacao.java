package atividades.lista1;

import java.util.Scanner;

/* 9. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em
que a pessoa nasceu).
* */

public class Ex09IdadeVotacao {

    public static void main(String[] args) {

    int anoAtual, anoNascimento, idade;

    Scanner in = new Scanner(System.in);
    System.out.println("Digite o ano Atual: ");
    anoAtual = in.nextInt();
    System.out.println("Digite o Ano de Nascimento: ");
    anoNascimento = in.nextInt();

    idade = anoAtual - anoNascimento;

    if (idade >= 16) {
        System.out.println("Esse ano você poderá votar!");
    }
    else {
        System.out.println("Esse ano você não poderá votar!");
    }

    }
}
