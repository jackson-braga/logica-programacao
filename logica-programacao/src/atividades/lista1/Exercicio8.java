package atividades.lista1;

import java.util.Scanner;

public class Exercicio8 {
    /**
     * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga
     * se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média
     * calculada.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a nota 1A do aluno: ");
        int umA = scann.nextInt();
        System.out.print("Informe a nota 2A do aluno: ");
        int doisA = scann.nextInt();
        float mediaAritmetica = (umA + doisA)/2;
        if (mediaAritmetica<6){
            System.out.println("\nA média do aluno foi: "+mediaAritmetica);
            System.out.println("O aluno foi reprovado!");
        }
        else{
            System.out.println("\nA média do aluno foi: "+mediaAritmetica);
            System.out.println("O aluno foi aprovado!");
        }

    }
}
