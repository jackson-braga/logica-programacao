package atividades.lista1;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio15 {
    private static String NASCIMENTO = "INSIRA O ANO DE NASCIMENTO DO FUNCIONARIO: ";
    private static String INGRESSO = "INSIRA O ANO DE INGRESSO NA EMPRESA: ";
    private static String APOSENTA = "REQUERER APOSENTADORIA";
    private static String NAO_APOSENTA = "NÃO REQUERE";
    private static String RESULTADO = "IDADE: %d, TEMPO DE TRABALHO: %d. ";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nascimento = getAno(entrada, NASCIMENTO);
        int ingresso = getAno(entrada, INGRESSO);
        System.out.printf(RESULTADO.concat(getConclusao(nascimento, ingresso)), calcula(nascimento), calcula(ingresso));
    }

    /*Este metodo pode retornar tanto ano de nascimento como de ingresso*/
    private static int getAno(Scanner entrada, String texto) {
        System.out.println(texto);
        return entrada.nextInt();
    }

    private static boolean isRetireble(int nascimento, int ingresso) {
        return calcula(nascimento) >= 65 || calcula(ingresso) >= 30 ||
               (calcula(nascimento) >= 60 && calcula(ingresso) >= 25) ? true : false;
    }

    /*Este método calcula tanto a idade como o tempo de trabalho,
    *de acordo com o valor do parametro inteiro*/
    private static int calcula(int parametro) {
        return LocalDate.now().getYear() - parametro;
    }

    private static String getConclusao(int nascimento, int ingresso) {
        return isRetireble(nascimento, ingresso) ? APOSENTA : NAO_APOSENTA;
    }
}
