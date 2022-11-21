package lista1;
// 1. Escreva um programa para ler as dimensões de um retângulo (base e altura),
//    calcular e escrever a área do retângulo.

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
//      Criar variaveis da base e altura e receber os valores do usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as medidas do retângulo.");
        System.out.println("Informe a base: ");
        float base = scan.nextFloat();
        System.out.println("Informe a altura: ");
        float altura = scan.nextFloat();

//      Criar saída com a área do retângulo calculando base * altura
        System.out.println("A área do retângulo é :" + (base * altura));
    }
}
