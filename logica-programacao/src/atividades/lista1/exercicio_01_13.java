//  13. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//  Álcool - até 20 litros, desconto de 2% por litro, acima de 20 litros, desconto de 5% por litro
//  Gasolina - até 20 litros, desconto de 3% por litro, acima de 20 litros, desconto de 6% por litro
//  Escreva um programa que leia o número de litros vendidos e o tipo de combustível (codificado
//  da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
//  sabendo-se que o preço do litro da gasolina é R$ 4,79 e o preço do litro do álcool é R$ 3,69.

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        // não consegui colocar as opções como A e G
        System.out.println("Qual combustível será abastecido? (Digite '1' para Alcool, ou '2' para Gasolina)");
        int opcaoComb = scann.nextInt();
        System.out.println("Qual a quantidade de combustível (em litros) será abastecida?");
        int litros = scann.nextInt();
        double valorComb = 0;

            switch (opcaoComb) {
                case 1:
                    valorComb = litros <= 20 ? (3.69 * 0.98) : (3.69 * 0.95);
                    break;

                case 2:
                    valorComb = litros <= 20 ? (4.79 * 0.97) : (4.79 * 0.94);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        double valorTotal = litros * valorComb;
        System.out.println("Sua compra dará o total de R$ " + valorTotal);

    }
}
