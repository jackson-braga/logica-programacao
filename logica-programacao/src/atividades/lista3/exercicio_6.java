package atividades.lista3;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);

        System.out.println("=========MENU========= \n" + "1. Média aritmética\n" + "2. Média ponderada\n" +"3. Sair");
        int num = scaneer.nextInt();

        if (num < 1 || num > 3) {
            System.out.println("OPÇÃO INVÁLIDA!");
        } else if (num == 1) {
            System.out.println("Informe a primeira nota");
            double n1 = scaneer.nextDouble();
            System.out.println("Informe a segunda nota");
            double n2 = scaneer.nextDouble();

            System.out.println((n1 + n2) / 2);
        } else if (num == 2) {
            System.out.println("Informe a primeira nota");
            double n1 = scaneer.nextDouble();
            System.out.println("Informe o peso da primeira nota");
            double p1 = scaneer.nextDouble();
            System.out.println("Informe a segunda nota");
            double n2 = scaneer.nextDouble();
            System.out.println("Informe o peso da segunda nota");
            double p2 = scaneer.nextDouble();
            System.out.println("Informe a terceira nota");
            double n3 = scaneer.nextDouble();
            System.out.println("Informe o peso da terceira nota");
            double p3 = scaneer.nextDouble();

            System.out.println(((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3));

        } else if (num == 3) {
            System.out.println("PROGRAMA ENCERRADO!");
        }
    }
}
