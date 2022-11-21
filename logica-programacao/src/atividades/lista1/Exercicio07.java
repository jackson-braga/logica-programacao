package atividades.lista1;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int maca = 0;
        double total_maca = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de Maçãs:");
        maca = scan.nextInt();
        while (maca < 0) {
            System.out.println("Número de Maçã INVÁLIDO:");
            System.out.println("Digite novamente a quantidade de Maçã:");
            maca = scan.nextInt();
        }
        if (maca < 12){
            total_maca = maca * 1.30;
        } else{
            total_maca = maca * 1.00;
        }
        System.out.printf("Valor Total:R$ %.2f%n", total_maca);
    }
}
