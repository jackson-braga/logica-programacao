package atividades.lista2;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa se alguém pode ou não doar sangue conforme idade.");
        System.out.println("Quantos anos você tem?");
        int idade = scan.nextInt();

        //Processamento de Dados
        String mensagem;
        if (idade >= 18 && idade <= 67) {
            mensagem = "Pode doar.";
        } else {
            mensagem = "Não pode doar.";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
