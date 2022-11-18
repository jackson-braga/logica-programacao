package atividades.lista2;

import java.util.Scanner;

public class Exercicio1 {
    private static final String IDADE = "Qual a idade? ";
    private static final String RESULTADO_POSITIVO = "Pode doar";
    private static final String RESULTADO_NEGATIVO = "Não pode doar";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = getIdade(entrada);
        System.out.printf(isDoador(idade) ? RESULTADO_POSITIVO : RESULTADO_NEGATIVO);
        entrada.close();
    }

    private static int getIdade(Scanner entrada) {
        System.out.println(IDADE);
        int idade = entrada.nextInt();
        return idade >= 0 ? idade : getIdade(entrada);
    }

    private static boolean isDoador(int idade) {
        return idade >= 18 && idade <= 67 ? true : false;
    }
}
