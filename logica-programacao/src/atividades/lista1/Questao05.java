package lista1;

//      5. Escreva um programa para ler uma temperatura em graus Fahrenheit,
//      calcular e escrever o valor correspondente em graus Celsius

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

        //      Criar variáveis e receber valor em Fahrenheit

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de temperatura de Fahrenheit para Celsius!");
        System.out.println("Informe a temperatura em Fahrenheit: ");
        float fahrenheit = scan.nextFloat();

        //      Calcular e exibir valor em Celsius
        float celsius = (((fahrenheit - 32) / 9) * 5);
        System.out.println("A temperatura de " + fahrenheit + " graus em Fahrenheit equivale a " + celsius + " graus em Celsius.");
    }
}
