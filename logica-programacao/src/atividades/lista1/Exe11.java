package atividades.lista1;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {

        int qtdAtualEstoque;
        int qtdMaxEstoque;
        int qtdMinEstoque;
        double qtdMedia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade atual do estoque:");
        qtdAtualEstoque = scanner.nextInt();

        System.out.println("Quantidade máxima do estoque:");
        qtdMaxEstoque = scanner.nextInt();

        System.out.println("Quantidade mínima do estoque:");
        qtdMinEstoque = scanner.nextInt();

        qtdMedia = (qtdMaxEstoque + qtdMinEstoque) / 2;

        if (qtdAtualEstoque >= qtdMedia) {
            System.out.println("Não efetuar compra!");

        } else {
            System.out.println("Efetuar compra!");

        }

    }

}
