package atividades.lista1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a quantidade atual do produto: ");
        double quantProduto = sc.nextInt();
        System.out.print("Entre com a quantidade mínima do produto: ");
        double quantMinimaProduto = sc.nextInt();
        System.out.print("Entre com a quantidade máxima do produto: ");
        double quantMaximaProduto = sc.nextInt();
        double quantMediaProduto = (quantMaximaProduto + quantMinimaProduto) / 2;

        if(quantProduto >= quantMediaProduto) {
            System.out.println("Não efetuar compra do produto.");
        } else {
            System.out.println("Efetuar compra do produto.");
        }

        sc.close();
    }
}
