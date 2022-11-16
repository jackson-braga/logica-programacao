package atividades.lista1;

import java.util.Scanner;

public class Exercicio7 {
    private static final String MACAS = "Quantas maçãs desejas comprar? ";
    private static final String PRECO = "O custo total vale R$ %.2f";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf(PRECO.concat("\n"), getPreco(entrada));
    }

    private static double getPreco(Scanner entrada) {
        System.out.println(MACAS);
        int quantidade = entrada.nextInt();
        /*ternário ao invés de IF-ELSE. A interrogação (?) faz papel
        *do IF e o dois pontos (:) faz papel do ELSE */
        return quantidade < 12 ? (double)quantidade * 1.3 : quantidade;
    }
}
