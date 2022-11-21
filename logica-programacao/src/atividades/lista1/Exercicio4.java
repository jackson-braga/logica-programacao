package atividades.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        //4. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão,
        //também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas. Escrever um programa que leia o valor
        //total de suas vendas e o salário fixo. Calcule e escreva o salário final do vendedor.

        Scanner scann = new Scanner(System.in);

        System.out.println("Informe o salário fixo.");
        float salario = scann.nextInt();

        System.out.println("Informe o valor total das vendas.");
        float vendas = scann.nextInt();

        System.out.println("O total do salário com comissões é de R$" + (salario + (vendas*0.05)) + ".");
    }
}
