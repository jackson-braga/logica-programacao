package atividades.lista1;

import java.util.Scanner;

public class Exercicio3 {
    /**
     * 3. Escreva um programa para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
     * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
     */
    private static final String PERGUNTA_ELEITORES = "Insira o número de eleitores do município: ";
    private static final String PERGUNTA_BRANCOS = "Insira o número de votos brancos: ";
    private static final String PERGUNTA_NULOS = "Insira o número de votos nulos: ";
    private static final String PERGUNTA_VALIDOS = "Insira o número de votos válidos: ";
    private static final String RESPOSTA_TOTAL_VOTOS = "\nTotal de votos computados: %.0f votos";
    private static final String RESPOSTA_BRANCOS = "\nVotos brancos: %.0f%%";
    private static final String RESPOSTA_NULOS = "\nVotos nulos: %.0f%%";
    private static final String RESPOSTA_VALIDOS = "\nVotos válidos: %.0f%%";
    private static final String RESPOSTA_TOTAL_ELEITORES = "\nTotal de eleitores: %.0f%%";
    private static final String ERRO_COMPUTADOS = "Nem todos os votos foram computados, favor revalidar.";
    private static final String ERRO_ELEITORES = "Foram contabilizados mais votos que eleitores, favor revalidar.";
    public static void main(String[] args) {
        double eleitores, brancos, nulos, validos;
        System.out.print(PERGUNTA_ELEITORES);
        eleitores = getValor();
        System.out.print(PERGUNTA_BRANCOS);
        brancos = getValor();
        System.out.print(PERGUNTA_NULOS);
        nulos = getValor();
        System.out.print(PERGUNTA_VALIDOS);
        validos = getValor();
        double totalVotos = calculaTotalVotos(eleitores, brancos, nulos, validos);
        if (totalVotos == eleitores) {
            System.out.printf(RESPOSTA_TOTAL_VOTOS, totalVotos);
            System.out.printf(RESPOSTA_BRANCOS, porcentagemBrancos(brancos, eleitores));
            System.out.printf(RESPOSTA_NULOS, porcentagemNulos(nulos, eleitores));
            System.out.printf(RESPOSTA_VALIDOS, porcentagemNulos(validos, eleitores));
            System.out.printf(RESPOSTA_TOTAL_ELEITORES, eleitores);
        } else if (totalVotos < eleitores) {
            System.out.println(ERRO_COMPUTADOS);
        } else {
            System.out.println(ERRO_ELEITORES);
        }
    }
    public static double getValor() {
        double valor;
        valor = new Scanner(System.in).nextInt();
        return valor;
    }

    public static double calculaTotalVotos(double eleitores, double brancos, double nulos, double validos) {
        double totalVotos = brancos + nulos + validos;
        return totalVotos;
    }

    public static double porcentagemBrancos(double brancos, double eleitores) {
        double brancosPorcentagem = (brancos * 100) / eleitores;
        return brancosPorcentagem;
    }

    public static double porcentagemNulos(double nulos, double eleitores) {
        double porcentagemNulos = (nulos * 100) / eleitores;
        return porcentagemNulos;
    }

    public static double porcentagemValidos(double validos, double eleitores) {
        double porcentagemValidos = (validos * 100) / eleitores;
        return porcentagemValidos;
    }
}
