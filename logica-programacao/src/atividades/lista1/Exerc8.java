package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc8 {
    public static void main(String[] args) {
//        Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga
//        se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média
//        calculada.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite Nota 1");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite Nota 2");
        double nota2 = leitor.nextDouble();

        double mediaArit = (nota1+ nota2) / 2;
        if( mediaArit >= 6){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
}
