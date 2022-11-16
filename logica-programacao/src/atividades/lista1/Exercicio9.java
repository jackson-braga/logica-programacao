package atividades.lista1;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio9 {
    private static final String ANO_ATUAL = "Ano atual ";
    private static final String NASCIMENTO = "Qual ano de nascimento? ";
    private static final String NAO = "não";
    private static final String VAZIO = "";
    private static final String RESULTADO = "A pessoa tem %d anos então %s poderá votar este ano";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(ANO_ATUAL.concat(String.valueOf(LocalDate.now().getYear())));
        int idade = getIdadeAtual(entrada);
        System.out.printf(RESULTADO.concat("\n"), idade, idade < 16 ? NAO : VAZIO);
    }

    private static int getIdadeAtual(Scanner entrada) {
        System.out.println(NASCIMENTO);
        int ano = entrada.nextInt();
        return LocalDate.now().getYear() - ano;
    }
}
