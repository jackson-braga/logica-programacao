//  5. Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e
//  escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):
//  𝐶 = ((𝐹 − 32) / 9 ) * 5
//  Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner  scann = new Scanner(System.in);

        System.out.println("Digite a temperatura a ser convertida, em Fahrenheits: ");
        int fahrenheit = scann.nextInt();
        int celcius = ((fahrenheit - 32) / 9 ) * 5;

        System.out.println("A temperatura Fahrenheit informada equivale a " + celcius + " graus Celcius");
    }
}
