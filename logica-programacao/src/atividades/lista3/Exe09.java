package atividades.lista3;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {

        int valor;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Digite um n�mero maior que 0: ");
            valor = scanner.nextInt();

            if (valor <= 0) {
                System.out.println("V�lor inv�lido!");

            } else {
                for (int index = 1; index <= valor; index++) {
                    System.out.print(index + "   ");
                }
            }

            break;

        }

    }

}
