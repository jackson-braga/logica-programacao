package atividades.lista1;

import java.util.Scanner;

public class Exercicio14 {
    /**
     * Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o
     * total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
     * que:
     * ● Se quantidade <= 5 o desconto será de 2%
     * ● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
     * ● Se quantidade > 10 o desconto será de 5%
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a descrição do produto (seu nome): ");
        String descricao = scann.next();
        System.out.print("Informe a quantidade de " + descricao + " adquiridos(as): ");
        int quantidade = scann.nextInt();
        System.out.print("Informe o preço untário do produto: R$ ");
        float preco = scann.nextFloat();
        float desconto = 0, total = quantidade * preco;
        if (quantidade <= 5) {
            desconto = preco * 0.02f;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = preco * 0.03f;
        } else if (quantidade > 10) {
            desconto = preco * 0.05f;
        }
        float totalFinal = total - desconto;
        System.out.println("O valor total do produto "+descricao+" será de R$ "+totalFinal);

    }
}
