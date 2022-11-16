package atividades.lista1;

import java.util.Scanner;

public class Exercicio6 {
    private static final String NOTAS = "Insira a nota da avaliação %d: ";
    private static final String MEDIA = "A media final vale %.2f";
    public static void main(String[] args) {
        double[] notas = obterNotas();
        System.out.printf(MEDIA.concat("\n"), calculaMedia(notas));
    }

    private static double[] obterNotas() {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[3];
        for(int i = 0; i < notas.length; i++) {
            System.out.printf(NOTAS, i+1);
            notas[i] = entrada.nextDouble();
        }
        return notas;
    }

    private static double calculaMedia(double[] notas) {
        return (notas[0]*2 + notas[1]*3 + notas[2]*5)/10;
    }
}
