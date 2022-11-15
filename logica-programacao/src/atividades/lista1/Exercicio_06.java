package atividades.lista1;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que retorna a media ponderada de três notas com pesos diferentes de um aluno.");
        System.out.println("Informe a primeira nota: (0 - 10)");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: (0 - 10)");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: (0 - 10)");
        double nota3 = scan.nextDouble();

        //Processamento de Dados
        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        //Saída de Dados
        System.out.println("A média ponderada final do aluno é " + mediaFinal);
    }
}
