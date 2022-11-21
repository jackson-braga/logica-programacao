package atividades.lista1;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double quant_atual = 0, quant_max = 0, quant_media = 0, quant_min = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade Atual do Produto no Estoque:");
        quant_atual = scan.nextDouble();
        while (quant_atual < 0) {
            System.out.println("Quantidade atual do produto INVÁLIDA:");
            System.out.println("Digite a quantidade atual do produto no estoque:");
            quant_atual = scan.nextDouble();
        }
        System.out.println("Quantidade Máxima do Produto no Estoque:");
        quant_max = scan.nextDouble();
        while (quant_max <= 0) {
            System.out.println("Quantidade máxima do produto INVÁLIDA:");
            System.out.println("Digite a quantidade maxima do produto:");
            quant_max = scan.nextDouble();
        }
        System.out.println("Quantidade Minima do Produto no Estoque:");
        quant_min = scan.nextDouble();
        while (quant_min <= 0) {
            System.out.println("Quantidade minima do produto INVÁLIDA:");
            System.out.println("Digite a quantidade minima do produto:");
            quant_min = scan.nextDouble();
        }
        quant_media = ((quant_max + quant_min) / 2);
        if (quant_atual >= quant_media) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}