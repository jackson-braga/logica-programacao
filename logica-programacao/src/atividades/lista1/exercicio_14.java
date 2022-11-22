package atividades.lista1;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {

        double quant;
        double preco;
        double desconto;
        double valor;
        double pagar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String p = scanner.next();
        System.out.println("Digite a quantidade desse prduto que vocêr quer: ");
        quant = scanner.nextDouble();
        System.out.println("Digite o preço unitário do prduto que vocêr quer: ");
        preco = scanner.nextDouble();

        if (quant <= 5){
            valor = quant * preco;
            desconto = ((quant * preco)/100)*2;
            pagar = valor - desconto;
            System.out.println("Os seus produtos custam: " + valor + " reais. \n" + "O desconto é de:" + desconto + " reais. \n" + "O valor total a pagar é: " + pagar + " reais.");
        } else if (quant>5 && quant<=10) {
            valor = quant * preco;
            desconto = ((quant * preco)/100)*3;
            pagar = valor - desconto;
            System.out.println("Os seus produtos custam: " + valor + " reais. \n" + "O desconto é de:" + desconto + " reais. \n" + "O valor total a pagar é: " + pagar + " reais.");
        } else if (quant>10) {
            valor = quant * preco;
            desconto = ((quant * preco)/100)*5;
            pagar = valor - desconto;
            System.out.println("Os seus produtos custam: " + valor + " reais. \n" + "O desconto é de:" + desconto + " reais. \n" + "O valor total a pagar é: " + pagar + " reais.");
        }
    }
}
