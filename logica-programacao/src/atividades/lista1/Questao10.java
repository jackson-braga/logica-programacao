package lista1;

//      10. A jornada de trabalho semanal de um funcionário é de 40 horas.
//      O funcionário que trabalhar mais de 40 horas receberá hora extra,
//      cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//      Escreva um programa que leia o número de horas trabalhadas em um mês,
//      o salário por hora e escreva o salário total do funcionário, que deverá
//      ser acrescido das horas extras, caso tenham sido trabalhadas
//      (considere que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        //      Criar variável com o a quantidade de horas trabalhadas no mês

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabMes = scan.nextInt();

        //      Criar variável com o a quantidade de horas trabalhadas no mês
        //      Calcular o salario base, sem horas extras, considerando 160h/mes
        //      (4 semanas * 40h/sem)

        System.out.println("Informe o valor do salário por hora: ");
        double salarioPorHora = scan.nextDouble();
        double salarioBase = 160 * salarioPorHora;

        //      Calcular se houve hora extra trabalhada e exibir o salário total
        //      acrescentando as horas extras, caso tenha trabalhado.

        int horasExtras = horasTrabMes - 160;

        if (horasExtras > 0) {
            System.out.println("O funcionário trabalhou " + horasExtras + " horas extras.");
            double salarioHorasExtras = horasExtras * salarioPorHora * 1.5f;
            double salarioTotal = salarioBase + salarioHorasExtras;
            System.out.printf("O salário base do funcionário é de R$%.2f", salarioBase);
            System.out.printf("\nO funcionário vai receber pelas horas extras trabalhadas o valor de R$%.2f", salarioHorasExtras);
            System.out.printf("\nO salário total do funcionário será de R$%.2f", salarioTotal);


        }



    }

}
