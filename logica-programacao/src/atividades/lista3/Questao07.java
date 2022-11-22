package lista3;

//      7. Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja,
//      para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo
//      valor lido. Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício caso o segundo valor informado seja ZERO.

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        // Criar variáveis e receber valores do usuário.
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double valor1 = scan.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double valor2 = scan.nextDouble();

        while (valor2 == 0) {
            System.out.println("VALOR INVÁLIDO. \nEste número não pode ser zero. Tente novamente. \nInforme o segundo valor:");
            valor2 = scan.nextDouble();
        }
        System.out.println("A divisão de " + valor1 + " por " + valor2 + " é = " + valor1 / valor2);


    }
}
