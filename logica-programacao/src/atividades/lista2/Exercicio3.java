package atividades.lista2;

import java.util.Scanner;

public class Exercicio3 {
    private static final String EQUILATERO = "é Equilátero";
    private static final String ISOSCELES = "é Isósceles";
    private static final String ESCALENO = "é Escaleno";
    private static final String NAO_EXISTE = "não existe";
    private static final String LADO = "Insira medida do lado %d do triângulo: ";
    private static final String RESULTADO = "O triângulo ";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] lados = getLados(entrada);
        System.out.printf(RESULTADO.concat(getTriangulo(lados)));
    }

    private static double[] getLados(Scanner entrada) {
        double[] lados = new double[3];
        for(int i = 0; i < lados.length;) {
            System.out.printf(LADO, ++i);
            lados[i-1] = entrada.nextDouble();
        }
        return lados;
    }

    private static String getTriangulo(double[] lados) {
        return !isTriangulo(lados) ? NAO_EXISTE : isEquilatero(lados) ? EQUILATERO :
               isIsosceles(lados) ? ISOSCELES : ESCALENO;
    }

    private static boolean isTriangulo(double[] lados) {
        return lados[0] < lados[1] + lados[2] &&
               lados[2] < lados[0] + lados[1] &&
               lados[1] < lados[2] + lados[0] ? true : false;
    }

    private static boolean isEquilatero(double[] lados) {
        return lados[0] == lados[1] && lados[1] == lados[2];
    }

    private static boolean isIsosceles(double[] lados) {
        return lados[0] == lados[1] || lados[1] == lados[2] || lados[0] == lados[2];
    }
}
