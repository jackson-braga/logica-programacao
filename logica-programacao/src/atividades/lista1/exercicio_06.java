// 6. Faça um programa que leia três notas de um aluno, calcule e escreva a média
// final deste aluno. Considere que a média é ponderada e que o peso das notas é 2, 3 e 5.
// Fórmula para o cálculo da média final é:
// 𝑀𝐸𝐷𝐼𝐴𝐹𝐼𝑁𝐴𝐿 = ((𝑁1 ×2) +(𝑁2 ×3) + (𝑁3 ×5)) / (2+3+5)

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scann.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = scann.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = scann.nextDouble();

        double mediaFinal = ((nota1 * 2) +(nota2 * 3) + (nota3 * 5)) / 10;

        System.out.println("Sua média final foi de " + mediaFinal);

    }
}
