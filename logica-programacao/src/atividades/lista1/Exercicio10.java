package atividades.lista1;

import java.util.Scanner;

public class Exercicio10 {
    private static final double EXTRA = 1.5;
    private static final int HORAS_MENSAIS = 160;
    private static final String HORA_TOTAL = "Qual o total de horas trabalhadas no mês? ";
    private static final String SALARIO_HORA = "Qual salario/hora do funcionário? ";
    private static final String RESULTADO = "O salario no mês será de R$ %.2f";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(HORA_TOTAL);
        double horas = entrada.nextInt();
        System.out.println(SALARIO_HORA);
        double salario = entrada.nextDouble();
        System.out.printf(RESULTADO.concat("\n"), getSalarioMensal(salario, horas));
    }

    private static double getSalarioMensal(double salario, double horas) {
        /*Se total de horas trabalhadas for maior que o normal de 160h
        *é calculado o salario com horas extras*/
        return horas > HORAS_MENSAIS ? calculaSalarioComHoraExtra(salario, horas)
               /*Se não, se as horas trabalhadas for menor, será calculado normalmente*/
               : salario * horas;
    }

    private static double calculaSalarioComHoraExtra(double salario, double horas) {
        double horasExtras = horas - HORAS_MENSAIS;
        return salario * (HORAS_MENSAIS + horasExtras * EXTRA);
    }
}
