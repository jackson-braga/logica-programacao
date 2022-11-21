package atividades.lista3;

import java.util.Scanner;

public class List03_Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a altura do tirângulo: ");
        int altura = scan.nextInt();

        for (int cont1 = 1; cont1 <= altura; cont1++) {

            for (int cont12 = 1; cont12 <= cont1; cont12++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}