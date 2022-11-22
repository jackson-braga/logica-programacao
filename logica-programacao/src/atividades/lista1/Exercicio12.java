package atividades.lista1;

import java.util.Scanner;

public class Exercicio12 {
    /**
     * 12. Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
     * OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe o valor A: ");
        int a = scann.nextInt();
        System.out.print("Informe o valor B: ");
        int b = scann.nextInt();
        System.out.print("Informe o valor C: ");
        int c = scann.nextInt();

        int validacaoUm = a + b;
        int validacaoDois = a + c;
        int validacaoTres = b + c;

        if (a < validacaoTres && b < validacaoDois && c < validacaoUm) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}
