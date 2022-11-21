package atividades.lista1;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        //9. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este
        //ano (não é necessário considerar o mês em que a pessoa nasceu).

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe ano de nascimento.");
        int anoDeNascimento = scann.nextInt();

        int idade = 2022 - anoDeNascimento;

        if(idade < 16){
            System.out.println("O cidadão não pode votar pois tem " + idade + " anos. O mínomo para votação é 16 anos.");
        }else{
            System.out.println("O cidadão pode votar pois tem " + idade + " anos.");
        }
    }
}
