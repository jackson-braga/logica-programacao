package lista1;

//      6. Faça um programa que leia três notas de um aluno, calcule e escreva
//      a média final deste aluno. Considere que a média é ponderada e que o
//      peso das notas é 2, 3 e 5.

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        //      Criar variáveis e receber valores das três notas do aluno

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de média final do aluno!");
        System.out.println("Informe a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.println("Informe a terceira nota: ");
        float nota3 = scan.nextFloat();

        //      Calcular média ponderada com peso 2, 3 e 5 e exibir média final

        float mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.printf("A média final do aluno é %.2f", mediaFinal);

    }
}
