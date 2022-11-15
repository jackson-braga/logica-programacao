package atividades.lista1;

import java.time.Year;
import java.util.Scanner;

public class Exercicio15 {
    /**
     * 15. Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um
     * dos seguintes requisitos deve ser satisfeito:
     * ● Ter no mínimo 65 anos de idade.
     * ● Ter trabalhado no mínimo 30 anos.
     * ● Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
     * Com base nas informações acima, faça um programa que leia: o ano de seu nascimento e o ano de seu ingresso na
     * empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
     * aposentadoria' ou 'Não requerer'.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento do empregado: ");
        int ano = scann.nextInt();
        System.out.println("Informe o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scann.nextInt();
        //validações
        int anoAtual = Year.now().getValue();
        int idadeEmpregado = anoAtual - ano;
        int anosTrabalhados = anoAtual - anoIngresso;
        boolean aposentadoria;
        if (idadeEmpregado >= 65
                && anosTrabalhados >= 30
                && idadeEmpregado >= 60
                && anosTrabalhados >= 25) {
            aposentadoria = true;
        } else {
            aposentadoria = false;
        }
        if (aposentadoria == true) {
            System.out.println("O empregado cumpre os requisitos.");
            System.out.println("● Ter no mínimo 65 anos de idade --> Idade do empregado : " + idadeEmpregado + " anos\n" +
                    "● Ter trabalhado no mínimo 30 anos --> Anos trabalhados: " + anosTrabalhados + " anos\n");
            System.out.println("Selecione uma das opções: ");
            System.out.println("1 - Requerer aponsentadoria.");
            System.out.println("2 - Não Requerer.");
            int requerer = scann.nextInt();

        } else {
            System.out.println("O empregado não cumpre os requisitos mínimos.");
            System.out.println("● Ter no mínimo 65 anos de idade --> Idade do empregado : " + idadeEmpregado + " anos\n" +
                    "● Ter trabalhado no mínimo 30 anos --> Anos trabalhados: " + anosTrabalhados + " anos\n");
        }

    }
}
