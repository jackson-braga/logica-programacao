package atividades.lista2;

import java.util.Scanner;

public class Exercicio4 {
    private static final String RETANGULO = " é retangulo";
    private static final String OBTUSANGULO = " é obtusângulo";
    private static final String ACUTANGULO = " é acutângulo";
    private static final String NAO_EXISTE = " não existe";
    private static final String RESULTADO = "O triangulo";
    private static final String ANGULOS = "Insira o angulo %d do triângulo: ";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] angulos = getAngulos(entrada);
        System.out.printf(RESULTADO.concat(getTriangulo(angulos)));
    }

    private static double[] getAngulos(Scanner entrada) {
        double[] angulos = new double[3];
        for(int i = 0; i < angulos.length;) {
            System.out.printf(ANGULOS, ++i);
            angulos[i-1] = entrada.nextDouble();
        }
        return angulos;
    }

    private static String getTriangulo(double[] angulos) {
        return !isTriangulo(angulos) ? NAO_EXISTE : isAgudo(angulos) ? ACUTANGULO :
               isReto(angulos) ? RETANGULO : OBTUSANGULO;
    }

    private static boolean isTriangulo(double[] angulos) {
        return angulos[0] + angulos[1] + angulos[2] == 180 ? true : false;
    }

    private static boolean isAgudo(double[] angulos) {
        return angulos[0] < 90 && angulos[1] < 90 && angulos[2] < 90 ? true : false;
    }

    private static boolean isReto(double[] angulos) {
        return angulos[0] == 90 || angulos[1] == 90 || angulos[2] == 90 ? true : false;
    }
}
