package atividades.lista1;

import java.util.Scanner;

public class Exercicio14 {
    private static final String NOME = "INSIRA O NOME DO PRODUTO: ";
    private static final String QUANTIDADE = "INSIRA A QUANTIDADE DO PRODUTO: ";
    private static final String PRECO = "INSIRA O PRECO UNITARIO DO PRODUTO: ";
    private static final String RESULTADO = "TOTAL R$ %.2f ; DESCONTO %.2f E TOTAL A PAGAR R$ %.2f";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = getNome(entrada);
        int quantidade = getQuantidade(entrada);
        calculaTotal(quantidade, entrada);
    }

    private static String getNome(Scanner entrada) {
        System.out.println(NOME);
        return entrada.nextLine();
    }

    private static int getQuantidade(Scanner entrada) {
        System.out.println(QUANTIDADE);
        return entrada.nextInt();
    }

    private static void calculaTotal(int quantidade, Scanner entrada) {
        double precoUnit = getPrecoUnitario(entrada);
        System.out.printf(RESULTADO.concat("\n"),
                quantidade * precoUnit, 1 - getDesconto(quantidade),
                quantidade * precoUnit * getDesconto(quantidade));
    }

    private static double getPrecoUnitario(Scanner entrada) {
        System.out.println(PRECO);
        return entrada.nextDouble();
    }

    private static double getDesconto(int quantidade) {
        return quantidade <= 5 ? 0.98 :
               quantidade > 10 ? 0.95 : 0.97;
    }
}
