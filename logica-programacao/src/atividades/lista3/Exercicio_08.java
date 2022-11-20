package atividades.lista3;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada, Processamento e Saída de Dados
        double nota1;
        double nota2;
        String resposta="";
        do {
            System.out.println("Informe a primeira nota: ");
            nota1 = scan.nextDouble();
            if (nota1 < 0 || nota1 > 10 ) {
                System.out.println("Nota inválida.");
                continue;
            }
            System.out.println("Informe a segunda nota: ");
            nota2 = scan.nextDouble();
            if (nota2 < 0 || nota2 > 10 ) {
                System.out.println("Nota inválida.");
                continue;
            }

            double media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno é " + media);

            System.out.println("NOVO CÁLCULO? (S/N)");
            resposta = scan.next().toLowerCase();

        }while (resposta.equals("s"));

    }
}
