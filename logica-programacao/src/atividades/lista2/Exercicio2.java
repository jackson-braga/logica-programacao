package atividades.lista2;

import java.util.Scanner;

public class Exercicio2 {
    private static final String POLIGONO = "Insira o número de lados do polígono: ";
    private static final String LADO = "Insira a medida do lado deste polígono em cm: ";
    private static final String RESULTADO_1 = "%s";
    private static final String RESULTADO_2 = " Area %.2f m²";
    private static final String TRIANGULO = "Triangulo";
    private static final String QUADRADO = "Quadrado";
    private static final String PENTAGONO = "Pentagono";
    private static final String NAO_POLIGONO = "Não é um polígomno";
    private static final String NAO_IDENTIFICADO = "Polígono não identificado";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lados = getPoligono(entrada);
        String poligono = getPoligono(lados);
        double medida = getMedida(entrada);
        System.out.printf(getResultado(lados), poligono, calculaArea(lados, medida));
    }

    private static int getPoligono(Scanner entrada) {
        System.out.println(POLIGONO);
        return entrada.nextInt();
    }

    private static String getPoligono(int lados) {
        return lados == 3 ? TRIANGULO : lados == 4 ? QUADRADO :
               lados == 5 ? PENTAGONO : lados < 3 ? NAO_POLIGONO : NAO_IDENTIFICADO;
    }

    private static double getMedida(Scanner entrada) {
        System.out.println(LADO);
        return entrada.nextDouble();
    }

    private static double calculaArea(int lados, double medida) {
        switch(lados) {
            case 3:
                return Math.pow(medida, 2) * Math.sqrt(3) / 4;

            case 4:
                return Math.pow(medida, 2);

            default:
                return 0;
        }
    }

    private static String getResultado(int lados) {
        return lados == 3 || lados == 4 ?
                RESULTADO_1.concat(RESULTADO_2) : RESULTADO_1;
    }
}
