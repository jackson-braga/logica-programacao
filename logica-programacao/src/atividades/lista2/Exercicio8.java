package atividades.lista2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    private static final String[] QUESTOES = {"Telefonou para a vítima? (S/N) ",
                                              "Esteve no local do crime? (S/N) ",
                                              "Mora perto da vítima? (S/N) ",
                                              "Devia para a vítima? (S/N) ",
                                              "Já trabalhou com a vítima? (S/N) "};
    private static final String SIM = "S";
    private static final String SUSPEITA = "Suspeita";
    private static final String CUMPLICE = "Cúmplice";
    private static final String ASSASSINO = "Assassino";
    private static final String INOCENTE = "Inocente";
    private static final String RESULTADO = "Classificação: %s \n";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sim = getRespostasSim(entrada);
        System.out.printf(RESULTADO, getResultado(sim));
    }

    private static int getRespostasSim(Scanner entrada) {
        int sim = 0;
        for(int i = 0; i < QUESTOES.length; i++) {
            System.out.printf(QUESTOES[i]);
            sim += isSim(entrada);
        }
        return sim;
    }

    private static int isSim(Scanner entrada) {
        String resposta = entrada.nextLine();
        return resposta.toUpperCase().equals(SIM) ? 1 : 0;
    }

    private static String getResultado(int sim) {
        return sim == 2 ? SUSPEITA : sim == 5 ? ASSASSINO :
               sim == 3 || sim == 4 ? CUMPLICE : INOCENTE;
    }
}
