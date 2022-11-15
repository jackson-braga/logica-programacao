package atividades.lista1;

import java.util.Scanner;

public class Exercicio3 {
    private static final String ELEITORES = "Insira quantidade total de eleitores do município ";
    private static final String BRANCOS = "Quantidade de votos em brancos ";
    private static final String NULOS = "Quantidade de votos nulos ";
    private static final String VALIDOS = "Quantidade de votos válidos ";
    private static final String RESULTADO = "\nTotal percentual de votos validos %.2f" +
                                            "\nTotal percentual de votos brancos %.2f" +
                                            "\nTotal percentual de votos nulos %.2f" +
                                            "\nTotal percentual de abstenções %.2f";

    public static void main(String[] args) {
        Scanner votos = new Scanner(System.in);
        int eleitores = getTotal(votos, ELEITORES);
        int brancos = getTotal(votos, BRANCOS);
        int nulos = getTotal(votos, NULOS);
        int validos = getTotal(votos, VALIDOS);
        /*Metodo void para exibição de resultado*/
        exibeResultado(RESULTADO, eleitores, nulos, brancos, validos);
    }

    private static int getTotal(Scanner votos, String texto) {
        System.out.println(texto);
        return votos.nextInt();
    }

    private static double getPorcentagem(int valor, int eleitores) {
        /*Casting (double), para conversão de um inteiro para double*/
        return ((double)valor/(double)eleitores)*100;
    }

    private static void exibeResultado(String texto, int eleitores, int nulos, int brancos, int validos) {
        System.out.printf(RESULTADO, getPorcentagem(validos, eleitores),
                getPorcentagem(brancos, eleitores), getPorcentagem(nulos, eleitores),
                getPorcentagem(eleitores - validos - nulos - brancos, eleitores));
    }
}
