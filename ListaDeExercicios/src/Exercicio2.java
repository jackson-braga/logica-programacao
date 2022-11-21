/*Lista de Exercícios 1
Exercício 2:
Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a quantidade de dias que
essa pessoa já viveu. Considerar ano com 365 dias e mês com 30 dias.
 */

import java.util.Scanner;
public class Exercicio2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Vamos calcular quantos dias você já viveu!\n" +
                    "Insira as informações do dia de hoje.");
            System.out.print("Dia: ");
            int dataAtual = scan.nextInt();
            System.out.print("Mês: ");
            int mesAtual = scan.nextInt();
            System.out.print("Ano: ");
            int anoAtual = scan.nextInt();

            System.out.println("Agora, insira as informações do seu nascimento.");
            System.out.print("Dia: ");
            int diaNascimento = scan.nextInt();
            System.out.print("Mês: ");
            int mesNascimento = scan.nextInt();
            System.out.print("Ano: ");
            int anoNascimento = scan.nextInt();

            int quantidadeDia;
            int quantidadeMes;
            int quantidadeAno;

            if (diaNascimento < dataAtual) {
                quantidadeDia = dataAtual - diaNascimento;
            } else {
                quantidadeDia = diaNascimento - dataAtual;
            }

            if (mesNascimento < mesAtual) {
                quantidadeMes = mesAtual - mesNascimento;
            } else {
                quantidadeMes = mesNascimento - mesAtual;
            }
            quantidadeAno = anoAtual - anoNascimento;

            int totalDia = quantidadeDia;
            int totalMes = quantidadeMes * 30;
            int totalAno = quantidadeAno * 365;
            int totalDiasVividos = totalDia + totalMes + totalAno;

            System.out.printf("Voce já viveu " + totalDiasVividos + " dias! \n" +
                    "Aproveite a vida!");

        }

    }
