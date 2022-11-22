package atividades.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela
        //pode doar sangue ou não.
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe sua idade.");
        int idade = scann.nextInt();

        if(idade > 17 && idade < 68){
            System.out.println("Você pode doar sangue.");
        }else{
            System.out.println("Você não pode doar sangue.");
        }
    }
}
