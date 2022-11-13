//  9. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
//  que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
//  em que a pessoa nasceu).

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        int nascimento = scann.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = scann.nextInt();
        int idade = anoAtual - nascimento;

        if (idade < 16) {
            System.out.println("Você ainda NÃO PODE votar nessas eleições!");

        } else if (idade >= 16 && idade < 18 || idade >= 65) {
            System.out.println("Você não é obrigado(a), mas PODE votar nessas eleições!");

        } else {
            System.out.println("Você DEVE votar nessas eleições!");
            }
        }
    }
