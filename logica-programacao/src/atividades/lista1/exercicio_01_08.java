//  8. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
//  simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar
//  que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scann.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = scann.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Você foi APROVADO, com média final: " + media);
        } else {
            System.out.println("Você foi REPROVADO, com média final: " + media);
        }
    }
}
