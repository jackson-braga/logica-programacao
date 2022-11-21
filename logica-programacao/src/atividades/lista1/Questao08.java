package lista1;

//        8. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média
//        aritmética simples e escrever uma mensagem que diga se o aluno foi
//        ou não aprovado (considerar que nota igual ou maior que 6 o aluno
//        é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        //      Criar variáveis e da 1ª e 2ª avaliações e receber valores do usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a nota da 1ª avaliação: ");
        float primeiraAvaliacao = scan.nextFloat();
        System.out.println("Informe a nota da 2ª avaliação: ");
        float segundaAvaliacao = scan.nextFloat();

        //      Calcular média aritmética simples atribuindo resultado à variável media

        float media = (primeiraAvaliacao + segundaAvaliacao) / 2;

        //      Imprimir média e se o aluno está aprovado (media >= 6) ou
        //      reprovado (media < 6).

        System.out.printf("Média: %.2f", media);
        if (media >= 6) {
            System.out.println("\nAluno aprovado!");
        } else if (media >= 0) {
            System.out.println("\nAluno reprovado!");
        } else {
            System.out.println("\nMédia inválida!");
                }
    }
}
