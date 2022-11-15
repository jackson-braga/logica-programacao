package atividades.lista1;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de maçâs: ");
        int macas = sc.nextInt();

        double custoMaca;
        if (macas < 12) {
            custoMaca = 1.30;
        } else {
            custoMaca = 1.00;
        }
        double custoTotal = custoMaca * macas;
        System.out.println("O custo total de " + macas + " maçãs é R$" + custoTotal);

        sc.close();
    }
}
