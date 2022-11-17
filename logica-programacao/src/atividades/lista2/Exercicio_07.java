package atividades.lista2;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Programa que diz se um ano ´bissexto.");
        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        //Processamento de Dados
        String mensagem;
        if (ano % 4 == 0 && ano % 100 != 0 ) {
            mensagem = "Bissexto";
        } else {
            mensagem = "Não é bissexto";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
