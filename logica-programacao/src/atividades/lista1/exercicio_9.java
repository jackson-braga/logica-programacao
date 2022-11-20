package atividades.lista1;

import java.util.Scanner;

public class exercicio_9 {
    //Mostrar se a pessoa pode votar a partir do ano atual e ano de nascimento
    public static void main(String[] args) {
        int anoAtual;
        int anoNascimento;
        int calculo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        System.out.println("Digite o seu ano de nascimento: ");
        anoNascimento = scanner.nextInt();
        calculo = anoAtual - anoNascimento;

        if (calculo>=16){
            System.out.println("Você está apto à votar!");
        }else {
            System.out.println("Você ainda não está apto à votar!");
        }
    }
}
