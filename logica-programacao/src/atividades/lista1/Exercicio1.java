package atividades.lista1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio1 {
    /**
     * 1. Escreva um programa para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
     */

    private static final String PERGUNTA_BASE = "Insira a base do retângulo: ";
    private static final String PERGUNTA_RETANGULO = "Insira a altura do retângulo: ";
    private static final String RESPOSTA_RETORNO = "A área do retângulo é de: ";

    public static void main(String[] args) {
        BigDecimal base, altura;

        System.out.print(PERGUNTA_BASE);
        base = getValor();
        System.out.print(PERGUNTA_RETANGULO);
        altura = getValor();
        System.out.println(RESPOSTA_RETORNO + calcularArea(base, altura) + " m²");
    }

    public static BigDecimal getValor() {
        BigDecimal valor = new Scanner(System.in).nextBigDecimal();
        return valor;
    }

    public static BigDecimal calcularArea(BigDecimal base, BigDecimal altura) {
        BigDecimal area;
        area = base.multiply(altura);
        return area;
    }
}
