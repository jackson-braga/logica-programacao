package lista1;

//      13. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//      Álcool: até 20 litros, desconto de 2% por litro;
//      acima de 20 litros, desconto de 5% por litro
//      Gasolina: até 20 litros, desconto de 3% por litro
//      acima de 20 litros, desconto de 6% por litro

//      Escreva um programa que leia o número de litros vendidos e o tipo de
//      combustível (codificado da seguinte forma: A-álcool, G-gasolina),
//      calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço
//      do litro da gasolina é R$ 4,79 e o preço do litro do álcool é R$ 3,69.

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        //      Criar variáveis do tipo de combustive, quantidade de litros
        //      adquirida.

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tipo de combustível adquirido:");
        System.out.println("Digite A para Álcool ou G para Gasolina:");
        String tipoCombustivel = String.valueOf(scan.nextLine().charAt(0));
        System.out.println("Informe o número de litros adquiridos:");
        double qtdLitrosAdquiridos = scan.nextDouble();

        //      Calcular e informar o preço final a partir da tabela de preços

        if (tipoCombustivel.equals("A") && qtdLitrosAdquiridos <= 20) {
            System.out.printf("O preço final a ser pago pelo cliente é de R$%.2f", (qtdLitrosAdquiridos * 3.69 * 0.98));
        } else if (tipoCombustivel.equals("A") && qtdLitrosAdquiridos > 20) {
            System.out.printf("O preço final a ser pago pelo cliente é de R$%.2f", qtdLitrosAdquiridos * (3.69 * 0.95));
        } else if (tipoCombustivel.equals("G") && qtdLitrosAdquiridos <= 20) {
            System.out.printf("O preço final a ser pago pelo cliente é de R$%.2f", qtdLitrosAdquiridos * (4.79 * 0.97));
        } else if (tipoCombustivel.equals("G") && qtdLitrosAdquiridos > 20) {
            System.out.printf("O preço final a ser pago pelo cliente é de R$%.2f", qtdLitrosAdquiridos * (4.79 * 0.94));
        }
    }
}
