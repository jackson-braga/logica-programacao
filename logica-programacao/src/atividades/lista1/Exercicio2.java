package atividades.lista1;

import java.util.Scanner;

public class Exercicio2 {
    private static final String HELLO = "Calculo de dias vividas";
    private static final String ANOS = "Insira sua idade em anos ";
    private static final String MESES = "Insira sua idade em meses deste ano ";
    private static final String DIAS = "Insira sua idade em dias a mais ";

    /*usado o \n que é um termo que usamos para pulo de linha de texto,
    *para que na apresentação do texto final pulasse de linha. o %d
    *serve para apresentar o resultado de um inteiro no meio do texto*/
    private static final String RESULTADO = "\nEssa pessoa já viveu %d dias";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(HELLO);
        /*Para os três parametros, chamando o mesmo método afim de
        *reaproveitar reduzir linhas de código.*/
        int anos = apresentar(entrada, ANOS);
        int meses = apresentar(entrada, MESES);
        int dias = apresentar(entrada, DIAS);
        /*Ao invés de usar o println(), foi usado apenas printf para
        *que o resultado calculado no método indicado, que retorna
        *um valor inteiro*/
        System.out.printf(RESULTADO, calculaDias(anos, meses, dias));
    }

    private static int apresentar(Scanner entrada, String texto) {
        System.out.println(texto);
        return entrada.nextInt();
    }

    private static int calculaDias(int anos, int meses, int dias) {
        return anos*365 + meses*30 + dias;
    }
}
