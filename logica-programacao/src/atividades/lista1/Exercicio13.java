package atividades.lista1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //13. Um posto está vendendo combustíveis com a seguinte tabela de descontos:

        //Álcool
        //até 20 litros, desconto de 2% por litro
        //acima de 20 litros, desconto de 5% por litro

        //Gasolina
        //até 20 litros, desconto de 3% por litro
        //acima de 20 litros, desconto de 6% por litro

        // Escreva um programa que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool,
        //G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,79 e o
        //preço do litro do álcool é R$ 3,69.

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o combustível.");
        String tipoCombustivel = scann.next();

        System.out.println("Informe a quantidade.");
        int quantidadeCombustivel = scann.nextInt();
        int quantExtra = 0;

        float precoAlcool = 3.69f;
        float precoGasolina = 4.79f;

        double preco = 0;

        int quantidadeExtra = quantidadeCombustivel - 20;
        double precoExtra = quantidadeExtra * 0.05;

        if(tipoCombustivel.equals("A")){
            if( quantidadeCombustivel > 20){
            preco = ((quantidadeCombustivel * precoAlcool) - 0.02);
            }else {
                preco = ((quantidadeCombustivel * precoAlcool) - 0.02) + ((quantidadeExtra * precoAlcool) - 0.05);
            }
        } else if (tipoCombustivel.equals("G")) {

            if( quantidadeCombustivel > 20){
                preco = ((quantidadeCombustivel * precoGasolina) - 0.02) + ((quantidadeExtra * precoGasolina) - 0.05);
            }else {
                preco = ((quantidadeCombustivel * precoGasolina) - 0.02);
            }
        }else{
            System.out.println("O combustível informado não é válido.");
            return;
        }
        System.out.println("O preço a total do combustível é de R$ " + preco + ".");
    }
}
