package atividades.lista1;

import java.util.Scanner;

/* 14. Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário.
Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar
(total a pagar = total - desconto), sabendo-se que:
    ● Se quantidade <= 5 o desconto será de 2%
    ● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
    ● Se quantidade > 10 o desconto será de 5%
* */
public class Ex14Vendas {

    public static void main(String[] args) {

        String nomeProduto;
        int qtAdquirida;
        double precoUnitario, total, desconto, totalPagar;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        nomeProduto = in.next();
        System.out.println("Digite a quantidade adquirida: ");
        qtAdquirida = in.nextInt();
        System.out.println("Digite o preço Unitário: ");
        precoUnitario = in.nextDouble();

        total = precoUnitario * qtAdquirida;

        if (qtAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (qtAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        totalPagar = total - desconto;
        System.out.printf("O valor total do produto %s foi R$%.2f, menos o desconto de R$%.2f " +
                "deu o valor total a pagar de R$%.2f.\n", nomeProduto, total, desconto, totalPagar);



    }
}
