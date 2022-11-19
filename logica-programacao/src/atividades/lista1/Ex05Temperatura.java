package atividades.lista1;

import java.util.Scanner;

/* Escreva um programa para ler uma temperatura em graus Fahrenheit,
calcular e escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):
𝐶 = ((𝐹−32) / 9)  * 5
Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F
* */
public class Ex05Temperatura {

    public static void main(String[] args) {

        double fahrenheit, celsius;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        fahrenheit = in.nextDouble();

        celsius = ((fahrenheit-32) / 9) * 5;

        System.out.printf("A temperatura %.0fºF transformada em graus Celsius é %.0fºC.", fahrenheit, celsius);




    }
}
