package atividades.lista1;

import java.util.Scanner;

public class Exercicio4 {
    private static final String SALARIO = "Salario base do funcionário ";
    private static final String TOTAL = "Total de carros vendidos pelo funcionário ";
    private static final String VENDA = "Valor da venda %d: ";
    private static final String SALARIO_FINAL = "O salario no final do mês será R$ %.2f";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*quantidade de carros vendidos*/
        int qtd = getCarrosVendidos(entrada);

        /*salario fixo*/
        double salario = getSalario(entrada);

        /*Calculo da comissão*/
        double comissaoTotal = exibeSomaVendas(qtd, entrada);

        /*A concatenação foi apenas para colocar possível
        *mensagem final do java para a proxima linha*/
        System.out.printf(SALARIO_FINAL.concat("\n"), comissaoTotal + salario);
    }

    private static int getCarrosVendidos(Scanner entrada) {
        System.out.println(TOTAL);
        return entrada.nextInt();
    }

    private static double getSalario(Scanner entrada) {
        System.out.println(SALARIO);
        return entrada.nextDouble();
    }

    private static double exibeSomaVendas(int qtd, Scanner entrada) {
        double soma = 0D;
        double[] venda = new double[qtd];
        for(int i = 0; i < venda.length; i++) {
            System.out.printf(VENDA, i+1);
            venda[i] = entrada.nextDouble();
            soma += venda[i]*0.05;
        }
        return soma;
    }
}
