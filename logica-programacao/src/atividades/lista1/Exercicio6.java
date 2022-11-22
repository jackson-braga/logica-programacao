package atividades.lista1;

import java.util.Scanner;

public class Exercicio6 {
    /**
     * Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considere que a média é
     * ponderada e que o peso das notas é 2, 3 e 5.
     * Fórmula para o cálculo da média final é:
     */
    public static final String PERGUNTA_NOTA_UM = "Informe a primeira nota do aluno: ";
    public static final String PERGUNTA_NOTA_DOIS = "Informe a segunda nota do aluno: ";
    public static final String PERGUNTA_NOTA_TRES = "Informe a terceira nota do aluno: ";
    public static final String RESPOSTA_RETORNO = "\nA média final ponderada do aluno é: %.2f";
    public static final int P_UM = 2;
    public static final int P_DOIS = 3;
    public static final int P_TRES = 5;


    public static void main(String[] args) {
        float nUm, nDois, nTres;
        System.out.print(PERGUNTA_NOTA_UM);
        nUm = getValor();
        System.out.print(PERGUNTA_NOTA_DOIS);
        nDois = getValor();
        System.out.print(PERGUNTA_NOTA_TRES);
        nTres = getValor();
        System.out.printf(RESPOSTA_RETORNO, calculaMediaFinal(nUm, nDois, nTres));
    }

    public static float getValor() {
        float valor = new Scanner(System.in).nextFloat();
        return valor;
    }

    public static float calculaMediaFinal(float nUm, float nDois, float nTres) {
        float mediaFinal = ((nUm * P_UM) + (nDois * P_DOIS) + (nTres * P_TRES) * 5) / (P_UM + P_DOIS + P_TRES);
        return mediaFinal;
    }
}
