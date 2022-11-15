package atividades.lista1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.println("Entre com a quantidade do(a) " + nomeProduto + ": ");
        int quantProduto = sc.nextInt();
        System.out.println("Entre com o valor unitario do(a) " + nomeProduto + ": ");
        float precoProduto = sc.nextFloat();
        float valorTotal = quantProduto * precoProduto;

        if(quantProduto <= 5) {
            double totalPagar = valorTotal - (valorTotal * 0.02);
            System.out.println("Valor total com desconto é: " + totalPagar);
        } else if (quantProduto > 5 && quantProduto<= 10) {
            double totalPagar = valorTotal - (valorTotal * 0.03);
            System.out.println("Valor total com desconto é: " + totalPagar);
        } else {
            double totalPagar = valorTotal - (valorTotal * 0.05);
            System.out.println("Valor total com desconto é: " + totalPagar);
        }

        sc.close();
    }
}
