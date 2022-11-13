//  15. Uma empresa quer verificar se um empregado está qualificado para a
//  aposentadoria ou não. Para estar em condições, um dos seguintes requisitos
//  deve ser satisfeito:
//  Ter no mínimo 65 anos de idade.
//  Ter trabalhado no mínimo 30 anos.
//  Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//  Com base nas informações acima, faça um programa que leia: o ano de seu
//  nascimento e o ano de seu ingresso na empresa. O programa deverá escrever
//  a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
//  aposentadoria' ou 'Não requerer'.

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int anoCorrente = 2022;
        System.out.println("Em que ano o funcionário nasceu? ");
        int anoNascimento = scann.nextInt();
        System.out.println("Em que ano ingressou na empresa? ");
        int anoEntrada = scann.nextInt();
        int idade = anoCorrente - anoNascimento;
        int tempoDeEmpresa = anoCorrente - anoEntrada;

        System.out.println("O funcionário tem " + idade + " anos de idade e " + tempoDeEmpresa + " anos na empresa.");

        if (idade >= 65 || tempoDeEmpresa > 30) {
            System.out.println("REQUERER APOSENTADORIA");
        } else if (idade >= 60 && tempoDeEmpresa >= 25) {
            System.out.println("REQUERER APOSENTADORIA");
        } else {
            System.out.println("Não requerer aposentadoria");
        }

    }
}
