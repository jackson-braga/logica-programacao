package lista3;

import java.util.Scanner;

public class Exercicio8 {

        // Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e
        // imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a
        // leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final.
        // Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o programa.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double media = 0;
        String continuar;

        do {
            do {
                System.out.println("Insira a nota da primeira avaliação: ");
                nota1 = input.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida");
                }
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("Insira a nota da segunda avaliação: ");
                nota2 = input.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida");
                }
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);

            System.out.println("Novo cálculo (S/N)?");
            continuar = input.next();
        } while (continuar.equalsIgnoreCase("s"));
    }
}

