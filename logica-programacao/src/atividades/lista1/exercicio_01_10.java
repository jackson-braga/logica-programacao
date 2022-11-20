//  10. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
//  trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
//  com um acréscimo de 50%. Escreva um programa que leia o número de horas trabalhadas em
//  um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser
//  acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

import java.util.Scanner;

public class exercicio_01_10 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println("Quantas horas foram trabalhadas na primeira semana?");
        int horasSem1 = scann.nextInt();
        System.out.println("Quantas horas foram trabalhadas na segunda semana?");
        int horasSem2 = scann.nextInt();
        System.out.println("Quantas horas foram trabalhadas na terceira semana?");
        int horasSem3 = scann.nextInt();
        System.out.println("Quantas horas foram trabalhadas na quarta semana?");
        int horasSem4 = scann.nextInt();
        int horasMes = horasSem1 + horasSem2 + horasSem3 + horasSem4;
        System.out.println("Qual sua remuneração/hora padrão?");
        double salarioHora = scann.nextDouble();

        if (horasSem1 > 40) {
            salarioHora = salarioHora * 1.5;
        } else {
            salarioHora = salarioHora;
        }
        double salarioSem1 = horasSem1 * salarioHora;

        if (horasSem2 > 40) {
            salarioHora = salarioHora * 1.5;
        } else {
            salarioHora = salarioHora;
        }
        double salarioSem2 = horasSem2 * salarioHora;

        if (horasSem3 > 40) {
            salarioHora = salarioHora * 1.5;
        } else {
            salarioHora = salarioHora;
        }
        double salarioSem3 = horasSem3 * salarioHora;

        if (horasSem4 > 40) {
            salarioHora = salarioHora * 1.5;
        } else {
            salarioHora = salarioHora;
        }
        double salarioSem4 = horasSem4 * salarioHora;
        double salarioMes = salarioSem1 + salarioSem2 + salarioSem3 + salarioSem4;

        System.out.println("Segundo suas horas trabalhadas, seu salário este mês será de R$ " + salarioMes);

    }
}
