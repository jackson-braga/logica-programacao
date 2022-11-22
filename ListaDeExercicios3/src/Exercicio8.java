/*Lista de Exercícios 3
Exercício 8:
Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média (simples) desse
aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO
CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o
programa.


 */

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        char opcao = 0;
        char N;
        do {
            System.out.println("Digite sua primeira nota: ");
            double nota1 = scann.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Digite uma opção válida. Valores de 0 a 10.");
                break;
            }

            System.out.println("Digite sua segunda nota: ");
            double nota2 = scann.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Digite uma opção válida. Valores de 0 a 10.");
                break;
            }

            double resultado = (nota1 + nota2) / 2;
            System.out.println("Sua média foi de " + resultado);
            System.out.println("NOVO CALCULO (S/N)? ");
            opcao = scann.next().charAt(0);

        } while (opcao != 'n' );
        System.out.println("Calculadora encerrada.");

    }
}