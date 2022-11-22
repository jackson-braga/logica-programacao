package atividades.lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        //7. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
        //Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o número de maças compradas.");

        int numeroMacas = scann.nextInt();

        if(numeroMacas < 12){
            System.out.println("O valor total é de R$ " + numeroMacas*1.30 + ".");
        }else{
            System.out.println("O valor total é de R$ " + numeroMacas + ",00 .");
        }
    }
}
