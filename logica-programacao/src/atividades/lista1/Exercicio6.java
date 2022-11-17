package lista1;

import java.util.Scanner;

public class Exercicio6 {
    // Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno.
    // Considere que a média é ponderada e que o peso das notas é 2, 3 e 5.
    public static void main(String[] args) {

        final int pesoNota1 = 2;
        final int pesoNota2 = 3;
        final int pesoNota3 = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Insira a nota 2: ");
        double nota2 = input.nextDouble();

        System.out.println("Insira a nota 3: ");
        double nota3 = input.nextDouble();

        double mediaFinal = ((nota1*pesoNota1)+(nota2*pesoNota2)+(nota3*pesoNota3))/(pesoNota1+pesoNota2+pesoNota3);

        System.out.println("A média final do aluno é: " + mediaFinal);


    }


}
