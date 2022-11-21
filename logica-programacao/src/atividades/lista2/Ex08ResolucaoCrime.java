package atividades.lista2;

/* 8. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
            1. Telefonou para a vítima?
            2. Esteve no local do crime?
            3. Mora perto da vítima?
            4. Devia para a vítima?
            5. Já trabalhou com a vítima?
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“.
Caso contrário, ele será classificado como “Inocente“
* */

import java.util.Scanner;

public class Ex08ResolucaoCrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] resp = new int[5];
        System.out.println("Telefonou para a vítima? | (1. SIM ou 2. NAO)");
        resp[0] = scan.nextInt();
        System.out.println("Esteve no local do crime? | (1. SIM ou 2. NAO)");
        resp[1] = scan.nextInt();
        System.out.println("Mora perto da vítima? | (1. SIM ou 2. NAO)");
        resp[2] = scan.nextInt();
        System.out.println("Devia para a vítima? | (1. SIM ou 2. NAO)");
        resp[3] = scan.nextInt();
        System.out.println("Já trabalhou com a vítima? | (1. SIM ou 2. NAO)");
        resp[4] = scan.nextInt();

        int count = 0;

        for ( int i = 0; i < resp.length; i++ ) {
            if (resp[i] == 1) {
                count ++;
            }
        }
        String msg;
        if (count == 5) {
            msg = "Esta pessoa é o assassino.";
        } else if (count > 2 && count < 5) {
            msg = "Esta pessoa foi cúmplice.";
        } else if (count == 2) {
            msg = "Esta pessoa é um suspeito.";
        } else {
            msg = "Esta pessoa é inocente.";
        }

        System.out.println(msg);

    }
}
