package atividades.lista2;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa se uma letra é vogal ou consoante.");
        System.out.println("Informe a letra: ");
        String letra =  (scan.next()).toLowerCase();

        //Processamento de Dados
        String mensagem;
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            mensagem = "Vogal";
        } else {
            mensagem = "Consoante";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
