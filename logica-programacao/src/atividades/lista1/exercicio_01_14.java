//  14. Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
//  Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar
//  (total a pagar = total - desconto), sabendo-se que:
//  Se quantidade <= 5 o desconto será de 2%
//  Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//  Se quantidade > 10 o desconto será de 5%

import java.util.Scanner;

public class exercicio_01_14 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite o nome do produto a ser adquirido: ");
        String nomeProd = scann.next();
        System.out.println("Digite a quantidade do produto a ser adquirido: ");
        int qtdProd = scann.nextInt();
        System.out.println("Digite o valor unitário do produto a ser adquirido: ");
        double valorUnit = scann.nextDouble();
        double desconto;
        if (qtdProd <= 5) {
            desconto = 0.02;
        } else if (qtdProd > 5 && qtdProd <= 10) {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }

        double totalBruto = qtdProd * valorUnit;
        double totalDesc = qtdProd * (valorUnit * desconto);
        double totalLiquido = totalBruto - totalDesc;
        System.out.println("O produto solicitado foi: " + nomeProd);
        System.out.println("Sua compra deu: R$ " + totalBruto);
        System.out.println("Seu desconto foi de: R$ " + totalDesc);
        System.out.println("Seu total com desconto ficou em: R$ " + totalLiquido);

    }
}
