package atividades.lista1;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa informa valor a ser pago dependendo da quantidade de maçãs");
        System.out.println("Quantas maçãs deseja comprar?");
        int macas = scan.nextInt();

        //Processamento de Dados
        int duzias = macas / 12;
        double totalAPagar = (duzias * 12) + ((macas % 12) * 1.3);

        //Saída de Dados
        System.out.println("O valor a ser pago é R$ " + totalAPagar + ".");
    }
}
