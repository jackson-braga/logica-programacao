package atividades.lista2;

import java.util.Scanner;

public class Exercicio5 {
    private static final String VOGAIS = "[aeiou]";
    private static final String ALFA = "[a-z]";
    private static final String VOGAL = "é vogal";
    private static final String CONSOANTE = "é consoante";
    private static final String LETRA = "Digite uma letra: ";
    private static final String RESULTADO = "%s ";
    private static final String EMPTY = "";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra = getLetter(entrada);
        System.out.printf(RESULTADO.concat(getResultado(letra)), letra);
    }

    private static String getLetter(Scanner entrada) {
        System.out.print(LETRA);
        String letra = entrada.nextLine();
        return letra.length() == 1 && isAlfa(letra) ? letra : getLetter(entrada);
    }

    private static String getResultado(String letra) {
        return letra.toLowerCase().replaceAll(VOGAIS, EMPTY)
                .isEmpty() ? VOGAL : CONSOANTE;
    }

    private static boolean isAlfa(String letra) {
        return letra.toLowerCase().replaceAll(ALFA, EMPTY).isEmpty();
    }
}
