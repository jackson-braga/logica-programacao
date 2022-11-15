package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 13/11/2022
 */
public class Exerc5 {
    public static void main(String[] args) {
//        Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus
//        Celsius (baseado na fórmula abaixo):
//        𝐶=((F-32)/9)*5
////        Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        double temperatura = leitor.nextDouble();

         double celsius = ((temperatura-32)/9)*5;
        System.out.println("Temperatura está º" + celsius);


    }
}
