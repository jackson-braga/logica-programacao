package atividades.lista1;

import java.util.Scanner;

/* Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considere que a média é ponderada e que o peso das notas é 2, 3 e 5.
Fórmula para o cálculo da média final é:
𝑀𝐸𝐷𝐼𝐴𝐹𝐼𝑁𝐴𝐿 = (𝑁1 ×2) + (𝑁2 ×3) + (𝑁3 ×5) / (2+3+5)
* */
public class Ex06NotasEscolares {
    public static void main(String[] args) {

        double n1, n2, n3, mediaFinal;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite três notas de um aluno: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        n3 = in.nextDouble();

        mediaFinal = ((n1*2) + (n2*3) + (n3*5)) / 10;

        System.out.printf("A média final do Aluno é %.1f.", mediaFinal);
    }
}
