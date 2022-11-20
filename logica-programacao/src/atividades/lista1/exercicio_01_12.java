//  12. Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo
//  e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor
//  de cada lado deve ser menor que a soma dos outros 2 lados.

import java.util.Scanner;

public class exercicio_01_12 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite um valor para um dos vértices do triângulo: ");
        int vert1 = scann.nextInt();
        System.out.println("Digite outro valor para outro dos vértices do triângulo: ");
        int vert2 = scann.nextInt();
        System.out.println("Digite outro valor para o último dos vértices do triângulo: ");
        int vert3 = scann.nextInt();

        if (vert1 >= vert2 + vert3 || vert2 >= vert1 + vert3 || vert3 >= vert1 + vert2) {
            System.out.println("Os vértices informados NÃO formam um triângulo!");
        } else {
            System.out.println("Os vértices informados formam um triângulo!");
        }

    }
}
