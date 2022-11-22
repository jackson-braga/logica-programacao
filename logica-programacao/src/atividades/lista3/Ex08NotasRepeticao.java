package atividades.lista3;

import java.util.Scanner;

/* 8. Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média (simples) desse
aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO
CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o
programa.
* */
public class Ex08NotasRepeticao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("Digite sua primeira nota: ");
            double nota1 = in.nextDouble();
            System.out.println("Digite sua segunda nota: ");
            double nota2 = in.nextDouble();

            if (nota1 < 0 || nota1 > 10 && nota2 < 0 || nota2 > 10) {
                System.out.println("Digite uma opção válida. Valores aceitos de 0 a 10.");
            } else {

                double resultado = (nota1 + nota2) / 2;
                System.out.println("Sua média foi de " + resultado);
            }
            System.out.println("NOVO CALCULO (S/N)? ");
            opcao = in.next().charAt(0);

        } while (opcao != 'n' && opcao != 'N');
        System.out.println("Calculadora encerrada.");

    }
}
