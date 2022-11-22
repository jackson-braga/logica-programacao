package atividades.lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Faça um programa que recebe a altura de um triângulo em um número inteiro e imprima-o utilizando asteriscos. Veja o
        //Exemplo:
        //Entrada: 5
        //*
        //**
        //***
        // ****
        //*****
        Scanner scann = new Scanner(System.in);
        System.out.println("Digite um número para altura");
        int altura = scann.nextInt();

        for(int i = 0; i < altura+1; i++){
            String result = new String(new char[i]).replace("\0", "*");
            System.out.println(result);
        }
    }
}
