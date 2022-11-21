/*Lista de Exercícios 1
Exercício 10:
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora
extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um programa que leia o número de horas
trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
 */

import java.util.Scanner;
public class Exercicio10 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        double horas;
        double valorHora;
        double salarioTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de horas trabalhadas: ");
        horas = scanner.nextDouble();
        System.out.println("Digite o valor das horas trabalhadas: ");
        valorHora = scanner.nextDouble();
        if (horas<=160){
            salarioTotal = (160*valorHora);
        }else {
            salarioTotal = (160*valorHora) + ((horas-160)*valorHora*1.5);
        }
        System.out.println("O salário total do mês é: " + salarioTotal + " reais.");

            }

}

