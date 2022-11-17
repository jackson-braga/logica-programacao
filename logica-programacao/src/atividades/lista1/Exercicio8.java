package lista1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio8 {
    // Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
    // uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
    // aluno é aprovado). Escrever também a média calculada.

    public static void main(String[] args) {

        String continuar;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Insira a nota da avaliação 1: ");
            double nota1 = input.nextDouble();

            System.out.println("Insira a nota da avaliação 2: ");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);

            if (media >= 6) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }

            System.out.println("Deseja calcular a média final de outro aluno? s/n");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s"));
    }
}
