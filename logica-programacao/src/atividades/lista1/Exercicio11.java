package atividades.lista1;

import java.util.Scanner;

public class Exercicio11 {
    private static final String RESULTADO = "%s EFETUAR A COMPRA";
    private static final String MIN = "INSIRA A QUANTIDADE MÍNIMA DE ESTOQUE: ";
    private static final String MAX = "INSIRA A QUANTIDADE MáXIMA DE ESTOQUE: ";
    private static final String ESTOQUE = "INSIRA A QUANTIDADE DE ESTOQUE: ";
    private static final String NAO = "NÃO";
    private static final String EMPTY = "";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int min = getValor(entrada, 0);
        int max = getValor(entrada, min);
        System.out.printf(RESULTADO.concat("\n"), getResultado(min, max, entrada));
    }

    private static int getValor(Scanner entrada, int valor) {
        if(valor > 0) {
            System.out.println(MAX);
            int max = entrada.nextInt();
            return max > valor ? max : getValor(entrada, valor);
        }
        System.out.println(MIN);
        return entrada.nextInt();
    }

    private static String getResultado(int min, int max, Scanner entrada) {
        System.out.println(ESTOQUE);
        int estoque = entrada.nextInt();
        return estoque < getMedia(min, max) ? EMPTY : NAO;
    }

    private static int getMedia(int min, int max) {
        return (min + max)/2;
    }
}
