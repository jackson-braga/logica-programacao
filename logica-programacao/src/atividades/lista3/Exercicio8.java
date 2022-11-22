package atividades.lista3;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //8. Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média (simples) desse
        //aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. Acrescente uma mensagem 'NOVO
        //CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o
        //programa.

        Scanner scann = new Scanner(System.in);
        System.out.println("Insira a primeira nota:");
        int nota1 = scann.nextInt();

        while(nota1 > 10 || nota1 < 0){
            System.out.println("Só são permitidos valores entre 0 e 10!");
            System.out.println("Insira um novo valor para primeira nota:");
            nota1 = scann.nextInt();
        }

        System.out.println("Insira a segunda nota:");
        int nota2 = scann.nextInt();

        while(nota2 > 10 || nota2 < 0){
            System.out.println("Só são permitidos valores entre 0 e 10!");
            System.out.println("Insira um novo valor para segunda nota:");
            nota2 = scann.nextInt();
        }

        System.out.println("A média é de " + ((nota1 + nota2)/2) + ".");


        System.out.println("NOVO CÁLCULO? (S/N)");
        String continua = scann.next();

        while(Objects.equals(continua, "S".toLowerCase())){
            System.out.println("Insira a primeira nota:");
            nota1 = scann.nextInt();

            System.out.println("Insira a segunda nota:");
            nota2 = scann.nextInt();

            System.out.println("A média é de " + ((nota1 + nota2)/2) + ".");

            System.out.println("NOVO CÁLCULO? (S/N)");
            continua = scann.next();
        }

        if(!Objects.equals(continua, "S".toLowerCase())){
            System.out.println("Operação incerrada!");
        }

    }
}
