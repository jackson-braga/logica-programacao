package atividades.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        //5. Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus
        //Celsius (baseado na fórmula abaixo):
        //Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F
        Scanner scann = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit para ter o resultado em Celsius.");
        float celsius = scann.nextInt();

        System.out.println("A temperatura em celsius é de " + ((celsius - 32)/9) * 5 + ".");

    }
}
