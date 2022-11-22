package atividades.lista1;

import java.util.Scanner;

public class Exercicio5 {
    /**
     * . Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus
     * Celsius (baseado na fórmula abaixo):
     * Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F
     */
    public static final String PERGUNTA = "Informe quantos graus em Fahrenheit: ";
    public static final String RESPOSTA_RETORNO = "\n%.1fº Celsius";
    public static void main(String[] args) {
        float fGraus;
        System.out.print(PERGUNTA);
        fGraus = getValor();
        System.out.printf(RESPOSTA_RETORNO, conversorGraus(fGraus));
    }
    public static float getValor() {
        float valor = new Scanner(System.in).nextFloat();
        return valor;
    }
    public static float conversorGraus(float fGraus){
        float cGraus = ((fGraus-32)/9)*5;
        return cGraus;
    }
}
