package atividades.lista1;

import java.util.Scanner;

public class Exercicio12 {
    private static final String LADOS = "ATRIBUA UM VALOR PARA O LADO %s DO TRIANGULO: ";
    private static final String RESULTADO = "%s UM TRIANGULO";
    private static final String TRIANGULO = "É";
    private static final String NAO = "NÃO ";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] lados = getLados(entrada);
        System.out.printf(RESULTADO.concat("\n"), isTriangle(lados) ? TRIANGULO : NAO.concat(TRIANGULO));
    }

    private static double[] getLados(Scanner entrada) {
        double[] lados = new double[3];
        for(int i = 0; i < lados.length; i++) {
            System.out.printf(LADOS.concat("\n"), getLado(i));
            lados[i] = entrada.nextDouble();
        }
        return lados;
    }

    private static String getLado(int i) {
        switch(i) {
            case 0:
                return "a";
            case 1:
                return "b";
            default:
                return "c";
        }
    }

    private static boolean isTriangle(double[] lados) {
        return lados[0] < lados[1] + lados[2] &&
               lados[1] < lados[0] + lados[2] &&
               lados[2] < lados[0] + lados[1] ? true : false;
    }
}
