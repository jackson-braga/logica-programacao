package lista1;

//      14. Faça um programa para ler: a descrição do produto (nome), a quantidade
//      adquirida e o preço unitário. Calcular e escrever o total
//      (total = quantidade adquirida * preço unitário), o desconto e o total
//      a pagar (total a pagar = total - desconto), sabendo-se que:
//          Se quantidade <= 5 o desconto será de 2%
//          Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//          Se quantidade > 10 o desconto será de 5%

import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {

        // Criar variáveis para a descrição do produto, quantidade adquirida e
        // preço unitário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a descrição do produto:");
        String descricaoProduto = scan.nextLine();
        System.out.println("Informe a quantidade adquirida do produto:");
        int qtdAdquirida = scan.nextInt();
        System.out.println("Informe o preço unitário do produto:");
        double precoUnitario = scan.nextDouble();

        // Calcular e imprimir o preço total, desconto e valor a pagar

        double precoTotal = qtdAdquirida * precoUnitario;
        System.out.println("Você está adquirindo " + qtdAdquirida + " unidade(s) do produto: " + descricaoProduto);
        System.out.printf("\nO preço total, sem descontos, seria de R$%.2f", precoTotal);

        if (qtdAdquirida <= 5) {
            System.out.printf("\nO seu desconto serà de R$%.2f", (precoTotal * 0.02));
            System.out.printf("\nO valor total a pagar, com desconto, serà de R$%.2f", (precoTotal * 0.98));
        } else if (qtdAdquirida <= 10) {
            System.out.printf("\nO seu desconto serà de R$%.2f", (precoTotal * 0.03));
            System.out.printf("\nO valor total a pagar, com desconto, serà de R$%.2f", (precoTotal * 0.97));
        } else {
            System.out.printf("\nO seu desconto serà de R$%.2f", (precoTotal * 0.05));
            System.out.printf("\nO valor total a pagar, com desconto, serà de R$%.2f", (precoTotal * 0.95));
        }




    }
}
