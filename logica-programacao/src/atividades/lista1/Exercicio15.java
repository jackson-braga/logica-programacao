package atividades.lista1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //15. Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um
        //dos seguintes requisitos deve ser satisfeito:
        //● Ter no mínimo 65 anos de idade.
        //● Ter trabalhado no mínimo 30 anos.
        //● Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
        //Com base nas informações acima, faça um programa que leia: o ano de seu nascimento e o ano de seu ingresso na
        //empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
        //aposentadoria' ou 'Não requerer'.
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o seu ano de nascimento.");
        int anoNascicmento = scann.nextInt();

        System.out.println("Informe o ano de começo na empresa.");
        int comeco = scann.nextInt();

        int idade = 2022 - anoNascicmento;
        int anosTrabalho = 2022 - comeco;

        if(idade >= 65){
            System.out.println("Requer aposentadoria.");
        } else if (anosTrabalho >= 30) {
            System.out.println("Requer aposentadoria.");
        } else if (idade >= 60 && anosTrabalho >=25) {
            System.out.println("Requer aposentadoria.");
        }else{
            System.out.println("Não requer aposentadoria.");
        }
    }
}
