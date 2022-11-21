package atividades.lista2;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {

        String[] respostas = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando interrogat�rio. Responda 's' para sim e 'n' para n�o.");

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Telefonou para a v�tima?");
        respostas[0] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Esteve no local do crime?");
        respostas[1] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Mora perto da v�tima?");
        respostas[2] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Devia para a v�tima?");
        respostas[3] = scanner.next();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("J� trabalhou com a v�tima?");
        respostas[4] = scanner.next();

        int qtdRespostasPositivas = 0;
        for (int index = 0; index < respostas.length; index++) {

           if (respostas[index].equalsIgnoreCase("S")) {
                qtdRespostasPositivas++;

            }

        }

        if (qtdRespostasPositivas == 2) {
            System.out.println("Voc� � Suspeita.");

        } else if (qtdRespostasPositivas == 3 || qtdRespostasPositivas == 4) {
            System.out.println("Voc� � C�mplice");

        } else if (qtdRespostasPositivas == 5) {
            System.out.println("Voc� � o Assassino.");

        } else {
            System.out.println("Voc� � Inocente.");

        }

    }

}
