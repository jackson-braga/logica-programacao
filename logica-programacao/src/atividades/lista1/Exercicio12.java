package lista1;

import java.util.Scanner;

public class Exercicio12 {
    // Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se
    // formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor
    // que a soma dos outros 2 lados.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lado A: ");
        int ladoA = input.nextInt();

        System.out.println("Lado B: ");
        int ladoB = input.nextInt();

        System.out.println("Lado C: ");
        int ladoC = input.nextInt();
        
        if (ladoA < (ladoB+ladoC)) {
            if (ladoB < (ladoA+ladoC)) {
                if (ladoC < (ladoA+ladoB)) {
                    System.out.println("É um triângulo");
                } else {
                    System.out.println("Não é um triângulo");
                }
            } else {
                System.out.println("Não é um triângulo");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
