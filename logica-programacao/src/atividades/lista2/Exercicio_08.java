package atividades.lista2;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que identifica se uma pessoa é suspeita.");
        String[] resp = new String[5];
        System.out.println("Telefonou para a vítima? (SIM ou NAO)");
        resp[0] = scan.next().toLowerCase();
        System.out.println("Esteve no local do crime? (SIM ou NAO)");
        resp[1] = scan.next().toLowerCase();
        System.out.println("Mora perto da vítima? (SIM ou NAO)");
        resp[2] = scan.next().toLowerCase();
        System.out.println("Devia para a vítima? (SIM ou NAO)");
        resp[3] = scan.next().toLowerCase();
        System.out.println("Já trabalhou com a vítima? (SIM ou NAO)");
        resp[4] = scan.next().toLowerCase();

        //Processamento de Dados
        int count = 0;
        for ( int i = 0; i < resp.length; i++ ) {
            if (resp[i].equals("sim")) {
                count ++;
            }
        }
        String mensagem;
        if (count == 5) {
            mensagem = "Assassino";
        } else if (count > 2 && count < 5) {
            mensagem = "Cumplice";
        } else if (count == 2) {
            mensagem = "Suspeito";
        } else {
            mensagem = "Inocente";
        }

        // Saída de Dados
        System.out.println(mensagem);
    }
}
