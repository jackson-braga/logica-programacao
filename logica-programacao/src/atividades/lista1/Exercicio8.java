package atividades.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        //8. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga
        //se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média
        //calculada.

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe a primeira nota.");
        int primeiraNota = scann.nextInt();

        System.out.println("Informe a segunda nota.");
        int segundaNota = scann.nextInt();

        double media = (primeiraNota+segundaNota) / 2.0;

        if(media < 6){
            System.out.println("O aluno foi reprovado com a média " + media + ".");
        }else{
            System.out.println("O aluno foi aprovado com a média " + media + ".");
        }
    }
}
