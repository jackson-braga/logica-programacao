package atividades.lista1;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Progama para descobrir quantos dias de vida você possui.");
        System.out.println("Quantos anos você tem?");
        int anosDeVida = scan.nextInt();
        System.out.println("Quantos meses se passaram após o mês do seu último aniversário? (Sem contar o atual)");
        int mesesDeVida = scan.nextInt();
        System.out.println("Em que dia do mês você nasceu?");
        int diasDeVidaDoMesDeNascimento = 30 - (scan.nextInt());
        System.out.println("Em que dia do mês estamos?");
        int diasDeVida = scan.nextInt();

        // Processamento de Dados
        int totalDeDias = (anosDeVida * 365) + (mesesDeVida * 30) + diasDeVidaDoMesDeNascimento + diasDeVida;

        // Saída de Dados
        System.out.println("Você viveu aproximadamente " + totalDeDias + " dias de vida.");
    }
}
