package atividades.lista2;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        String[] respostas = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando interrogatório. Responda 's' para sim e 'n' para não.");

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Telefonou para a vítima?");
        respostas[0] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Esteve no local do crime?");
        respostas[1] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Mora perto da vítima?");
        respostas[2] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Devia para a vítima?");
        respostas[3] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = scanner.next();

        int qtdRespostasPositivas = 0;
        for (int index = 0; index < respostas.length; index++) {

           if (respostas[index].equalsIgnoreCase("S")) {
                qtdRespostasPositivas++;

            }

        }

        if (qtdRespostasPositivas == 2) {
            System.out.println("Você é Suspeita.");

        } else if (qtdRespostasPositivas == 3 || qtdRespostasPositivas == 4) {
            System.out.println("Você é Cúmplice");

        } else if (qtdRespostasPositivas == 5) {
            System.out.println("Você é o Assassino.");

        } else {
            System.out.println("Você é Inocente.");

        }

    }

}
