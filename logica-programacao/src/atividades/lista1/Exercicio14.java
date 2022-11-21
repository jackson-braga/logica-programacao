package atividades.lista1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double preco_uni = 0, total = 0, desconto = 0, total_pagar = 0;
        String descricao;
        int quantidade = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome Produto:");
        descricao = scan.nextLine();
        descricao = descricao.toUpperCase();

        System.out.println("Quantidade adiquira do produto " + descricao + ":");
        quantidade = scan.nextInt();
        while (quantidade < 0) {
            System.out.println("Quantidade INVÁLIDA!");
            System.out.println("Digite quantidade adiquira do produto " + descricao + ":");
            quantidade = scan.nextInt();
        }

        System.out.println("Preço unitário:");
        preco_uni = scan.nextDouble();
        while (preco_uni < 0) {
            System.out.println("Preço INVÁLIDA!");
            System.out.println("Digite o preço unitário do produto " + descricao +":");
            preco_uni = scan.nextDouble();
        }

        if (quantidade <= 5) {
            total = quantidade * preco_uni;
            desconto = total * 0.02;
            total_pagar = total - desconto;
        } else if ((quantidade > 5) && (quantidade <= 10)) {
            total = quantidade * preco_uni;
            desconto = total * 0.03;
            total_pagar = total - desconto;
        } else if (quantidade > 10) {
            total = quantidade * preco_uni;
            desconto = total * 0.05;
            total_pagar = total - desconto;
        }
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", total_pagar);
    }
}
