package atividades.lista1;

import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que verifica quantidade em estoque, e necessidade de compra.");
        System.out.println("Informe a quantidade de produtos em estoque: ");
        int emEstoque = scan.nextInt();
        System.out.println("Informe a quantidade mínima de produtos prevista para o estoque: ");
        int minima = scan.nextInt();
        System.out.println("Informe a quantidade máxima de produtos prevista para o estoque: ");
        int maxima = scan.nextInt();

        //Processamento de Dados
        int media = (minima + maxima) / 2;
        String mensagem;
        if ( emEstoque >= media) {
            mensagem = "Não efetuar compra.";
        }
        else {
            mensagem = "Efetuar comprar.";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
