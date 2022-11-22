package lista3;

//      8. Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média (simples) desse
//      aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO
//      CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o
//      programa.

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        // Criar variáveis e receber valores do usuário.

        Scanner scan = new Scanner(System.in);

        char opcao;
        do {
            System.out.println("Informe a primeira nota: ");
            double nota1 = scan.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("NOTA INVÁLIDA. A nota deve ser de 0 a 10.");
                break;
            }

            System.out.println("Informe a segunda nota: ");
            double nota2 = scan.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("NOTA INVÁLIDA. A nota deve ser de 0 a 10.");
                break;
            }

            double media = (nota1 + nota2) / 2;
            System.out.println("Sua média foi de " + media);
            System.out.println("Deseja realizar novo cálculo (S/N)? ");
            opcao = scan.next().charAt(0);

        } while (opcao != 'n' );
        System.out.println("Saindo do programa.");
    }
}


