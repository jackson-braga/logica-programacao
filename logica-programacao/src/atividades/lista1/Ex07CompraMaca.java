package atividades.lista1;

import java.util.Scanner;

/* As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas,
calcule e escreva o custo total da compra
* */
public class Ex07CompraMaca {

    public static void main(String[] args) {

       double valorTotal;
       int macasCompradas;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade de maças compradas: ");
        macasCompradas = in.nextInt();

        if (macasCompradas < 12) {
            valorTotal = 1.30 * macasCompradas;
        } else {
            valorTotal = macasCompradas * 1.00;
        }

        System.out.printf(" A compra de %d maças gera um custo total de R$%.2f.\n", macasCompradas, valorTotal);
        in.close();
    }
}
