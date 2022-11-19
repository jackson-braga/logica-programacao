package atividades.lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {
    private static final String A = "Conceito A";
    private static final String B = "Conceito B";
    private static final String C = "Conceito C";
    private static final String D = "Conceito D";
    private static final String E = "Conceito E";

    private static final String NOTA = "Insira a nota da avaliação %d: ";
    private static final String APROVADO = "Aprovado";
    private static final String REPROVADO = "Reprovado";
    private static final String RESULTADO = "Nota1: %.2f; Nota2: %.2f; Media: %.2f; %s; %s \n";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = getNotas(entrada);
        double media = getMedia(notas);
        System.out.printf(RESULTADO, notas[0], notas[1], media, getConceito(media), getResultado(media));
    }

    private static double[] getNotas(Scanner entrada) {
        double[] notas = new double[2];
        for(int i = 0; i < notas.length; i++) {
            System.out.printf(NOTA, i+1);
            notas[i] = entrada.nextInt();
        }
        return notas;
    }

    private static double getMedia(double[] notas) {
        return Arrays.stream(notas).sum()/notas.length;
    }

    private static String getConceito(double media) {
        return media >= 9 ? A : media >= 7.5 && media < 9 ? B :
               media >= 6 && media < 7.5 ? C : media >= 4 && media < 6 ? D : E;
    }

    private static String getResultado(double media) {
        return media >= 6 ? APROVADO : REPROVADO;
    }
}
