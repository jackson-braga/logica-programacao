package atividades.lista1;

import java.time.Year;
import java.util.Scanner;

public class Exercicio2 {
    /**
     * 2. Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a quantidade de dias que
     * essa pessoa já viveu. Considerar ano com 365 dias e mês com 30 dias.
     */
    private static final int DIAS_ANO = 365;
    private static final int DIAS_NO_MES = 30;
    private static final String MENSAGEM_INICIAL = "Insira a data de nascimento: ";
    private static final String PERGUNTA_DIA = "Dia: ";
    private static final String PERGUNTA_MES = "Mês: ";
    private static final String PERGUNTA_ANO = "Ano: ";
    private static final String RESPOSTA_RETORNO = "A pessoa já viveu: %d dias";

    public static void main(String[] args) {


        int dia, mes, ano, quantidadeDias;
        //data atual
        System.out.println(MENSAGEM_INICIAL);
        System.out.print(PERGUNTA_DIA);
        dia = getValor();
        System.out.print(PERGUNTA_MES);
        mes = getValor();
        System.out.print(PERGUNTA_ANO);
        ano = getValor();
        //calculo e retorno
        System.out.printf(RESPOSTA_RETORNO, calculoQuantidadeDias(dia, mes, ano));
    }
    public static int getValor(){
        int valor;
        valor = new Scanner(System.in).nextInt();
        return valor;
    }
    public static int calculoQuantidadeDias(int dia, int mes, int ano){
        int anoAtual = Year.now().getValue();
        int quantidadeDias = ((anoAtual - ano) * DIAS_ANO) + (mes * DIAS_NO_MES) + dia;
        return quantidadeDias;
    }
}
