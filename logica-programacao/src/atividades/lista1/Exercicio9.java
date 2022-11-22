package atividades.lista1;

import java.util.Scanner;

public class Exercicio9 {
    /**
     * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este
     * ano (não é necessário considerar o mês em que a pessoa nasceu).
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe o ano atual: ");
        int anoAtual = scann.nextInt();
        System.out.print("Informe o ano de nascimento do eleitor: ");
        int anoEleitor = scann.nextInt();
        int controle = anoAtual - anoEleitor;
        if(controle >=16){
            System.out.println("\nIdade do eleitor: " +controle);
            System.out.println("O eleitor está elegível ao voto.");
        }else {
            System.out.println("\nIdade do eleitor: " +controle);
            System.out.println("O eleitor NÃO está elegível ao voto.");
        }
    }
}
