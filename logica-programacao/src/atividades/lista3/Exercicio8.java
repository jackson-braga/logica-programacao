package atividades.lista3;

import java.util.Scanner;

public class Exercicio8 {
    /**
     * 8. Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média (simples) desse
     * aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO
     * CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o
     * programa.
     */
    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {
        float notaUm, notaDois;
        char opcao;
        do {
            do {
                System.out.print("Informe a nota 1a: ");
                notaUm = scann.nextFloat();
                if (notaUm < 0 || notaUm > 10) System.out.println("Informe um valor válido, no range de 0 a 10");
            } while (notaUm < 0 || notaUm > 10);
            do {
                System.out.print("Informe a nota 2a: ");
                notaDois = scann.nextFloat();
                if (notaDois < 0 || notaDois > 10) System.out.println("Informe um valor válido, no range de 0 a 10");
            } while (notaDois < 0 || notaDois > 10);
            double media = (notaUm + notaDois) / 2;
            System.out.printf("A média é: %.2f", media);
            System.out.println("\n NOVO CÁLCULO (S/N)?");
            opcao = Character.toUpperCase(scann.next().charAt(0));
            switch (opcao) {
                case 'S':
                    System.out.println("Solicitado novo cálculo.");

                    break;
                case 'N':
                    System.out.println("Saindo do sistema.");
                    System.exit(0);
                    break;
            }
        } while (opcao == 'S');
    }
}
