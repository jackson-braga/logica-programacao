package lista1;

import java.util.Scanner;

public class Exercicio14 {

    // Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o
    //preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário),
    // o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Produto: ");
        String produto = input.next();

        System.out.println("Quantidade adquirida: ");
        int quantidade = input.nextInt();

        System.out.println("Preço unitário: ");
        double precoUnitario = input.nextDouble();

        double desconto = 0;

        if (quantidade <= 5) {
            desconto = 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }

        double total = quantidade * precoUnitario;
        double totalComDesconto = total - (total*desconto);

        System.out.println("Total sem desconto = " + total + " R$");
        System.out.println("Desconto = " + desconto*100 + " %");
        System.out.println("Total com desconto = " + totalComDesconto + " R$");

    }

}
