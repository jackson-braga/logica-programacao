package atividades.lista2;

import java.util.Scanner;

public class Exercicio7 {
    private static final String BISSEXTO = "É BISEXTO";
    private static final String NAO = "NÃO É BISSEXTO";
    private static final String ANO = "Insira um ano: ";
    private static final String RESULTADO = "%d ";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano = getAno(entrada);
        boolean bissexto = isBissexto(ano);
        System.out.printf(RESULTADO.concat(bissexto ? BISSEXTO : NAO), ano);
    }

    private static int getAno(Scanner entrada) {
        System.out.println(ANO);
        try {
            return entrada.nextInt();
        } catch(Exception e) {
            return getAno(entrada);
        }
    }

    private static boolean isBissexto(int ano) {
        return ano > 0 && ano % 4 == 0 &&
               ano % 100 != 0 ? true : false;
    }
}
