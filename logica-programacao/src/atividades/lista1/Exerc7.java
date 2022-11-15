package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc7 {
    public static void main(String[] args) {
//        As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
//        Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas maças deseja ?");
        int qtd = leitor.nextInt();
        double duzia = 1.00;
        double meiaDuzia = 1.30;

        double resultado = qtd * duzia;
        double resultado1= qtd * meiaDuzia;
        if(qtd >= 12){
            System.out.println("Valor total da compra R$ "+ resultado);
        }else{
            System.out.println("Valor da compra R$ " + resultado1);
        }

    }
}
