package atividades.lista1;

import java.util.Scanner;

public class Exercicio4 {
    /**
     * 4. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão,
     * também fixa, para cada carro vendido de 5% do valor das vendas por ele efetuadas. Escrever um programa que leia o valor
     * total de suas vendas e o salário fixo. Calcule e escreva o salário final do vendedor.
     */
    private static final float PROCENTAGEM_COMISSAO_FIXA = 0.05f;
    private static final String MENSAGEM_TOTA_VENDAS = "Informe o valor total de vendas do empregado: ";
    private static final String MENSAGEM_CARROS = "Informe o número de carros vendidos: ";
    private static final String MENSAGEM_SALARIO = "Informe o salário fixo do empregado: R$ ";
    private static final String RESPOSTA_RETORNO = "O salário final do empregado com comissão é de: R$ %.2f";

    public static void main(String[] args) {
        float tVendas, veiculosVendidos, salario, comissao;
        System.out.print(MENSAGEM_TOTA_VENDAS);
        tVendas = getValor();
        System.out.print(MENSAGEM_CARROS);
        veiculosVendidos = getValor();
        System.out.print(MENSAGEM_SALARIO);
        salario = getValor();
        System.out.printf(RESPOSTA_RETORNO, salarioFinal(salario, veiculosVendidos, tVendas));
    }

    public static float getValor() {
        float valor = new Scanner(System.in).nextFloat();
        return valor;
    }

    public static float calculaComissão(float tVendas) {
        float comissao = tVendas * PROCENTAGEM_COMISSAO_FIXA;
        return comissao;
    }

    public static float salarioFinal(float salario, float veiculosVendidos, float tVendas) {
        float salarioFinal = salario + (veiculosVendidos * calculaComissão(tVendas));
        ;
        return salarioFinal;
    }
}
