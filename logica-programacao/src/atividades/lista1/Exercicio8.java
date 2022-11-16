package atividades.lista1;

import java.util.Scanner;

public class Exercicio8 {
    private static final String NOTAS = "Qual a nota da avaliação %d ? ";
    private static final String RESULTADO = "O aluno está %s e sua média vale %.2f";
    private static final int AVALIACOES = 2;
    private static final String APROVADO = "aprovado";
    private static final String REPROVADO = "reprovado";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = getNotas(entrada);
        double media = (notas[0] + notas[1])/2;
        System.out.printf(RESULTADO.concat("\n"), getResultado(media), media);
    }

    private static double[] getNotas(Scanner entrada) {
        double[] notas = new double[AVALIACOES];
        for(int i = 0; i < notas.length; i++) {
            System.out.printf(NOTAS, i+1);
            notas[i] = entrada.nextDouble();
        }
        return notas;
    }

    private static String getResultado(double media) {
        return media < 6 ? REPROVADO : APROVADO;
    }
}
