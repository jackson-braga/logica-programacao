package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc9 {
    public static void main(String[] args) {
//        Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este
//        ano (não é necessário considerar o mês em que a pessoa nasceu).
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite ano atual!");
        int anoatual = leitor.nextInt();

        System.out.println("Digite seu ano de nascimento");
        int anoNasc = leitor.nextInt();

        int votacao = anoatual - anoNasc;

        if(votacao >= 18 ){
            System.out.println("Você poderá votar este ano!");
        }else{
            System.out.println("Você *NÃO* poderá votar este ano!");
        }
    }
}
