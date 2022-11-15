package atividades.lista1;

import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que lê descrição, quantidade e valor unitário de produto.");
        System.out.println("Informe o nome do produto: ");
        String produto = scan.next();
        System.out.println("Quantos produtos foram adquiridos?");
        double quantidade = scan.nextDouble();
        System.out.println("Qual valor pago por unidade?");
        double unit = scan.nextFloat();

        //Processamento de Dados
        double total = quantidade * unit;
        double desconto;

        if (quantidade <= 5) {
            desconto = 0.98;
        } else if (quantidade <= 10) {
            desconto = 0.97;
        }else {
            desconto = 0.95;
        }
        double totalFinal = total * desconto;

        //Saída de Dados
        System.out.println("Ao comprar " + quantidade + " unidades de " + produto + " por R$" + unit + " cada. Foi gasto o valor " +
                "de R$" + total + ". Com desconto de quantidade o valor final ficou em R$" + totalFinal + ".");
    }
}
