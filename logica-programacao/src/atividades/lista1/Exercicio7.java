package atividades.lista1;

import java.util.Scanner;

public class Exercicio7 {
    /**
     * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
     * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra
     */
    public static final String PERGUNTA = "Informe quantas unidades de maçã foram vendidas: ";
    public static final String RESPOSTA_RETORNO_VENDAS = "Foram vendidas %d maçãs.";
    public static final String RESPOSTA_RETORNO_VALOR_TOTAL = "O valor total da compra foi de R$: %.2f";
    public static final float MENOS_DUZIA = 1.3f;
    public static final float MAIOR_DUZIA = 1f;
    public static final int DUZIA = 12;
    public static void main(String[] args) {
        float vendaFinal;
        int maca;
        System.out.print(PERGUNTA);
        maca = getValor();
        System.out.printf(RESPOSTA_RETORNO_VENDAS,maca);
        System.out.printf(RESPOSTA_RETORNO_VALOR_TOTAL, calculaVendaFinal(maca));
    }
    public static int getValor() {
        int valor = new Scanner(System.in).nextInt();
        return valor;
    }
    public static float calculaVendaFinal(int maca){
        float vendaFinal;
        if (maca < DUZIA) {
            vendaFinal = maca * MENOS_DUZIA;
        } else {
            vendaFinal = maca * MAIOR_DUZIA;
        }
        return vendaFinal;
    }
}